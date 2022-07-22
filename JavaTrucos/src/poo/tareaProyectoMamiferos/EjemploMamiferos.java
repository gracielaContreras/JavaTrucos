package poo.tareaProyectoMamiferos;

import poo.tareaProyectoMamiferos.mamifero.canino.*;
import poo.tareaProyectoMamiferos.mamifero.felinos.*;
import poo.tareaProyectoMamiferos.mamifero.Mamifero;

public class EjemploMamiferos {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[5];
        Mamifero leon = new Leon("Sur de Africa",12,2000,200,
                    "Rey Reon",22, 220, 12,120);
        Mamifero guepardo  = new Guepardo("Sur de Africa",13,3000,100,
                    "Rey Guepardo",23, 230);
        Mamifero tigre  = new Tigre("Sur de Africa",14,2400,400,
                "Rey Tigre",24, 240, "tigre rápido");

        Mamifero lobo  = new Lobo("America del norte",15,5000,
                500,"Rey Lobo",15, 15, "Lobo rápido");

        Mamifero perro  = new Perro("America del sur",16,600,
                60,"Rey Perro",60,16);

        mamiferos[0] = leon;
        mamiferos[1] = guepardo;
        mamiferos[2] = tigre;
        mamiferos[3] = lobo;
        mamiferos[4] = perro;

        for (Mamifero animal : mamiferos ) {

            System.out.println(" =============== " + animal.getClass().getSimpleName() + " =============== ");
            System.out.println("Habitat:" + animal.getHabitat());
            System.out.println("Altura:" + animal.getAltura());
            System.out.println("Largo:" + animal.getLargo());
            System.out.println("Peso:" + animal.getPeso());

            if (animal instanceof Canino) {
                System.out.println("Clomillos:" + ((Canino) animal).getTamanoColmillos());
                System.out.println("Color:" + ((Canino) animal).getColor());

                if (animal instanceof Lobo) {
                    System.out.println("Especie Lobo:" + ((Lobo) animal).getEspecieLobo());
                    System.out.println("Número Integrantes:" + ((Lobo) animal).getNumCamada());
                }
                if (animal instanceof Perro) {
                    System.out.println("Fuerza mordida kg:" + ((Perro) animal).getFuerzaMordida());
                }
            }

            if (animal instanceof Felino) {
                System.out.println("Tamaño Garras:" + ((Felino) animal).getTamanoGarras());
                System.out.println("Velocidad:" + ((Felino) animal).getVelocidad());

                if (animal instanceof Leon) {
                    System.out.println("Potencia Rugido:" + ((Leon) animal).getPotenciaRugidoDecibel());
                    System.out.println("Número Integrantes:" + ((Leon) animal).getNumManada());
                }
                if (animal instanceof Tigre) {
                    System.out.println("especie Tigre:" + ((Tigre) animal).getEspecieTigre());
                }
            }

            System.out.println(animal.comer());
            System.out.println(animal.dormir());
            System.out.println(animal.correr());
            System.out.println(animal.comunicarse());
            System.out.println("\n");
        }
    }
}
