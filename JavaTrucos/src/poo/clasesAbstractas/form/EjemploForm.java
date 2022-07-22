package poo.clasesAbstractas.form;

import poo.clasesAbstractas.form.elementos.ElemtosForm;
import poo.clasesAbstractas.form.elementos.InputForm;
import poo.clasesAbstractas.form.elementos.SelectForm;
import poo.clasesAbstractas.form.elementos.TextareaForm;
import poo.clasesAbstractas.form.elementos.select.Opcion;
import poo.clasesAbstractas.form.validador.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador())
                .addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());
        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());
//        Opcion java = new Opcion("1", "Java");
        lenguaje
        .addOpcion(new Opcion("1", "Java"))
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "JavaScript").setSelected())
        .addOpcion(new Opcion("4", "TypeScript"))
        .addOpcion(new Opcion("5", "PHP"));

        //Clase anónima
        ElemtosForm saludar = new ElemtosForm("Saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value=\"" + this.valor + "\">";
            }
        };
        saludar.setValor("Hola que tal este campo está deshabilitado");
        username.setValor("john.doe");
        password.setValor("a1b2c1d4");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... más de 10 años de experiencia ...");
//        java.setSelected(true);

        //Primera forma:
        /*      List<ElemtosForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);*/

        //Segunda forma:
        List<ElemtosForm> elementos = Arrays.asList(
                                        username,password, email,edad,experiencia,lenguaje, saludar);

        //Primera forma de iterar:
        /*        for (ElemtosForm e: elementos ) {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }*/
        //Segunda forma de iterar: //es programación funcional
        elementos.forEach(e ->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        //imprime los mensajes de errores almacenados en la lista
        elementos.forEach( e ->{
          if(! e.esValido()){
              e.getErrores().forEach(System.out::println) ;//Aplicando alias o atajo en expresión lambda. Método de referencia
//              e.getErrores().forEach(err -> System.out.println(e.getNombre() + " : "+ err)) ;//Aplicando alias o atajo en expresión lambda. Método de referencia
//              e.getErrores().forEach(System.out::println) ;//Aplicando alias o atajo en expresión lambda. Método de referencia
//              e.getErrores().forEach(err -> System.out.println(err));
          }
        });

    }
}
