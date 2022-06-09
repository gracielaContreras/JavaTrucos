package poo;

import java.util.Arrays;
import java.util.Date;

public class EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil nissan =  new Automovil();
        nissan.setFabricante("nissan");
        nissan.setModelo("v20");
        nissan.setTipo(TipoAutomovil.HATCHBACK);

        Automovil coupe =  new Automovil();
        coupe.setFabricante("coupe");
        coupe.setModelo("v20");
        coupe.setTipo(TipoAutomovil.COUPE);

        System.out.println(nissan);
        System.out.println("Ejemplos de enum");

        TipoAutomovil tipo = nissan.getTipo();
        System.out.println("Que tipo de auto es el " + nissan.getFabricante() + "? ");
        switch (tipo){
            case COUPE -> System.out.println("Es un auto pequeño de 2 puertas");   //a partir de java 13 se puede utilizar él -> y se elimina el break del switch;
            case HATCHBACK -> System.out.println("Es un auto mediano compacto. de 4 puertas");
            case CONVERTIBLE -> System.out.println("Es un auto deportivo. de 2 puertas");
        }
        System.out.println();
        TipoAutomovil[] tipos = TipoAutomovil.values();
        for(TipoAutomovil ta : tipos){
            System.out.println(ta + " => " + ta.name()+ " "+
                ta.getNombre()+ ", "+
                ta.getDescription()+ ", "+
                ta.getNumeroPuerta());
        }



    }
}
