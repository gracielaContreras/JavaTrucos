package poo.genericsclass.conGenerico;

import poo.genericsclass.sinGenerico.*;

public class EjemploConGenericos {
    public static void main(String[] args) {

        CamionGenerico<Animal> transporteAnimal = new CamionGenerico<>(3);
        transporteAnimal.add(new Animal("Jack", "Perro"));
        transporteAnimal.add(new Animal("tomy", "Gato"));
        transporteAnimal.add(new Animal("terry", "Perro"));

        /* Otra forma de imprimir
                for( Animal a : transporteAnimal ){
                    //Se eliminaron los cast, al aplicar genérico
                    System.out.println(a.getNombre() + " tipo: " + a.getTipo());
                }*/
        imprimirCamion(transporteAnimal);
        System.out.println("------------------------------------");

        CamionGenerico<Maquinaria> transporteMaquinaria = new CamionGenerico<>(3);
        transporteMaquinaria.add(new Maquinaria("Bulldozer"));
        transporteMaquinaria.add(new Maquinaria("Grúa Horquilla"));
        transporteMaquinaria.add(new Maquinaria("Perforadora"));

        /*  Otra forma de imprimir
                for( Maquinaria m : transporteMaquinaria ){
                    //Se eliminaron los cast, al aplicar genérico
                    System.out.println(m.getTipo());
                }*/
        imprimirCamion(transporteMaquinaria);
        System.out.println("------------------------------------");

        CamionGenerico<Automovil> transporteAutomovil = new CamionGenerico<>(3);
        transporteAutomovil.add(new Automovil("Toyota"));
        transporteAutomovil.add(new Automovil("Nissan"));
        transporteAutomovil.add(new Automovil("Honda"));

        /*   Otra forma de imprimir
                for( Automovil a : transporteAutomovil ){
                    //Se eliminaron los cast, al aplicar genérico
                    System.out.println(a.getMarca());
                }*/
        imprimirCamion(transporteAutomovil);
    }

    public static <T> void imprimirCamion(CamionGenerico<T> camion){
        for( T a : camion){
            if( a instanceof Animal ){
                System.out.println( ((Animal) a).getNombre() +
                                    " tipo: " + ( (Animal) a).getTipo());
            }
            else if( a instanceof Maquinaria ){
                System.out.println( ((Maquinaria) a).getTipo());
            }
            else if ( a instanceof Automovil){
                System.out.println(( (Automovil) a).getMarca());
            }
        }

    }
}
