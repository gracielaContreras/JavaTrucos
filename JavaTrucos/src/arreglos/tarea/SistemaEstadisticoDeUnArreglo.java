package arreglos.tarea;

import java.util.Scanner;

public class SistemaEstadisticoDeUnArreglo {

/**    Leer 7 números por teclado para llenar un arreglo y
    a continuación calcular el promedio de los números positivos,
    el promedio de los negativos y contar el número de ceros.*/

    public static void main(String[] args) {

        int[] a = new int[7];
        Scanner scan =  new Scanner(System.in);
        int contadorPositivo = 0, contadorNegativo =0, contadorNumeroCero = 0;
        int sumaPositivo = 0, sumaNegativo = 0;

        for (int i = 0; i < a.length; i++){
            System.out.print("Ingrese un número positivo o negativo: ");
            a[i] =  scan.nextInt();
        }

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0){
                sumaPositivo+= a[i];
                contadorPositivo++;
            } else if(a[i] == 0){
                contadorNumeroCero++;
            } else{
                sumaNegativo+= a[i];
                contadorNegativo++;
            }
        }
        if (sumaPositivo == 0 ){
            System.out.println("No se pudo realizar el promedio de números positivos");
        }else {
            System.out.println("Promedio números positivos : " + ( (float) (sumaPositivo/contadorPositivo)));
        }
        if(sumaNegativo == 0) {
            System.out.println("No se pudo realizar el promedio de números negativos");
        } else {
            System.out.println("Promedio números negativos : " + ( (float) (sumaNegativo/contadorNegativo)));
        }

        System.out.println("Cantidad números de ceros : " + contadorNumeroCero);

    }
}
