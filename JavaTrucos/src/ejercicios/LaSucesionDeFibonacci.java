package ejercicios;

/*
 * Reto #2
 * LA SUCESIÓN DE FIBONACCI
 * Dificultad: DIFÍCIL
 *
 * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
 * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
 * 0, 1, 1, 2, 3, 5, 8, 13...
 *
 */

public class LaSucesionDeFibonacci {
    public static void main(String[] args) {

        int valor0 = 0;
        int valor1 = 1;

        for (int i = 0; i < 50; i++) {

            System.out.print(valor0 + " ");

            int resultado = valor0 + valor1;
            valor0 = valor1;
            valor1 = resultado;
        }
    }
}
