package poo;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {



        Automovil nissan =  new Automovil();
        nissan.setFabricante("nissan");
        nissan.setModelo("v20");



        Automovil nissan2 =  new Automovil();
        nissan2.setFabricante("nissan");
        nissan2.setModelo("v20");

        Date fecha =  new Date();
        System.out.println(nissan);
        //se realizó Override del método equals en la clase Automóvil
        System.out.println("Ejemplos de equals");
        System.out.println("son iguales? " + (nissan == nissan2));
        System.out.println("son iguales con equals? " + (nissan.equals(nissan2)));
        System.out.println(nissan.equals(fecha));
//        Automovil.setPatente("Azul");
        System.out.println("Ejemplos de toString");
        System.out.println(nissan); //llamar de forma implícita
        System.out.println(nissan.toString()); //llamar de forma explícita
        Automovil.setPatente("Azul");
        System.out.println(nissan);
    }
}
