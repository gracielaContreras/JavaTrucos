package anotaciones.util;

import anotaciones.Init;
import anotaciones.JsonAtributo;
import anotaciones.util.exception.JsonSerializadorException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Objects;

public class JsonSerializador {

    public static void inicializarObjeto(Object obj){
        if(Objects.isNull(obj)) {
            throw new JsonSerializadorException("El objeto serializable no puede ser null!");
        }
        //Procesar las anotaciones del objeto
        Method[] metodos = obj.getClass().getDeclaredMethods();
        Arrays.stream(metodos)
                .filter( m -> m.isAnnotationPresent(Init.class))
                .forEach(m -> {
                    m.setAccessible(true);
                    try {
                        m.invoke(obj);
                    } catch (IllegalAccessException | InvocationTargetException e) {
                        throw new JsonSerializadorException("Error al serializar, no se puede iniciar el objeto");
                    }
                });
    }

    public static String convertirJson(Object obj) {
        if(Objects.isNull(obj)) {
            throw new JsonSerializadorException("El objeto serializable no puede ser null!");
        }

        inicializarObjeto(obj);

        //Procesar las anotaciones del objeto
        Field[] atributos = obj.getClass().getDeclaredFields();
        return Arrays.stream(atributos)
                .filter(f -> f.isAnnotationPresent(JsonAtributo.class)) //Si en producto encuentra la anotación JsonAtributo en los atributos
                .map(f -> { //Lo vamos a convertir en String para la estructura Json
                    f.setAccessible(true); //Cuando los atributos son privados se debe dejar en true
                    String nombre = f.getAnnotation(JsonAtributo.class).nombre().equals("")
                            ? f.getName() //Si es vacío se asigna el nombre del campo
                            : f.getAnnotation(JsonAtributo.class).nombre(); //Si no el valor que contiene el atributo nombre de la anotación
                    try {
/*                        //Capitalizar el primer carácter, Fue reemplazado por el método inicializarObjeto(obj);
                        Object valor= f.get(obj);
                        if(f.getAnnotation(JsonAtributo.class).capitalizar() && valor instanceof String){
                            String nuevoValor = (String) valor;
                         //1° forma
                            nuevoValor = nuevoValor.substring(0,1).toUpperCase()//con el 0 obtenemos el primer carácter o elemento del String
                                            + nuevoValor.substring(1).toLowerCase();
                            /Fin de Capitalizar el primer carácter
                            //2° forma
                            nuevoValor = Arrays.stream(nuevoValor.split(" "))
                                            .map(palabra -> palabra.substring(0,1).toUpperCase() //con el 0 obtenemos el primer carácter o elemento del String
                                                  + palabra.substring(1).toLowerCase()) //con el 1 obtenemos los demás elementos del String
                                            .collect(Collectors.joining(" ")); //Junta todos los elementos en uno solo, separado con un espacio

                            f.set(obj, nuevoValor);
                        }
                        */
                        return "\"" + nombre + "\":\"" + f.get(obj) + "\"";
                    } catch (IllegalAccessException e) {
                        throw new JsonSerializadorException("Error al serializar a json: " + e.getMessage());
                    }
                })
                .reduce("{", (a, b) -> { //Vamos a reducir todos los campos con una estructura Json
                    if ("{".equals(a)) {
                        return a + b;
                    }
                    return a + ", " + b;
                }).concat("}");
    }
}
