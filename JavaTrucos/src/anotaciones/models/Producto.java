package anotaciones.models;

import anotaciones.Init;
import anotaciones.JsonAtributo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Producto {

    @JsonAtributo() //Este atributo se va a exportar a Json
    private String nombre;
    @JsonAtributo //Este atributo se va a exportar a Json
    private Long precio;
    private LocalDate fecha;
    @Init
    private void init(){
        //Actualizamos el nombre a nivel de un método
       this.nombre = Arrays.stream(nombre.split(" "))
                .map(palabra -> palabra.substring(0,1).toUpperCase() //con el 0 obtenemos el primer carácter o elemento del String
                        + palabra.substring(1).toLowerCase()) //con el 1 obtenemos los demás elementos del String
                .collect(Collectors.joining(" ")); //Junta todos los elementos en uno solo, separado con un espacio
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
