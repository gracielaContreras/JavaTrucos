package patrones_de_diseno.observer.ejemplos;

import patrones_de_diseno.observer.Corporate;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporate google = new Corporate("Google", 2000);

   //Para quitar el casteo se debe modificar el toString de Corporate, asi podemos imprimir el objeto 'observable'
        google.addObserver((observable, obj) ->
                System.out.println("John "+ observable));

        google.addObserver((observable, obj) ->
                System.out.println("Ana "+ ((Corporate)observable).getNombre() +
                        " nuevo precio $"+ ((Corporate)observable).getPrecio()));

        google.addObserver((observable, obj) ->
                System.out.println("Maria "+ ((Corporate)observable).getNombre() +
                        " nuevo precio $"+ ((Corporate)observable).getPrecio()));

        //Como no hemos modificado el precio como resultado no muestra nada, no notifica
        //Ahora vamos a modificar el precio
        google.modificarPrecio(3000);
        //Como hemos modificado el precio como resultado imprime los siguientes:
/*         John Google nuevo precio $3000
         Ana Google nuevo precio $3000
         Maria Google nuevo precio $3000*/
    }
}
