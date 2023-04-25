package Java8Features.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Persona{
    private String nombre;
    private Integer edad;

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return this.edad;
    }
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}

public class PruebaStreams {
    public static void main(String[] args) {
    List<Persona> personas = Arrays.asList(new Persona("eduardo", 35),
                        new Persona("angela", 38),
                        new Persona("Dina", 15),
                        new Persona("alvaro", 41),
                        new Persona("manuel", 67));

        //Programación Imperativa
        List<Persona> result = new ArrayList<Persona>();
        int count = 0;
        for (Persona p : personas) {
            if(p.getEdad() >= 18){
                result.add(p);
                count++;
            }
            if(count == 3){
                break;
            }
        }
        System.out.println(result);
        //Fin Programación Imperativa
        System.out.println();

        //Programación funcional
        List<Persona> resultado = personas.stream()
                                            .filter(persona -> persona.getEdad() >= 18)
                                            .limit(3)
                                            .collect(Collectors.toList());
        System.out.println(resultado);

        System.out.println();

        personas.stream()
                .filter(persona -> persona.getEdad() >= 18)
                .limit(3)
                .forEach(System.out::println);
        //fin Programación funcional
    }
}
