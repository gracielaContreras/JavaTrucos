package arreglos.tarea;

import java.util.Scanner;

public class MayorOcurrenciaEnArreglo {

/** Para la tarea se debe crear un arreglo con 10 elementos (enteros en el rango de 1 a 9).
    Escriba un programa que imprima el número que tiene más ocurrencias en el arreglo y
    también imprimir la cantidad de veces que aparece en el arreglo.
    Por ejemplo, para el arreglo: {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}

    Como resultado debería imprimir lo siguiente:
    La mayor ocurrencias es: 3
    El elemento que mas se repite es: 5

    En el ejemplo, el elemento que más se repite en el arreglo es el número 5 con una ocurrencia de 3 veces.*/

    public static void main(String[] args) {

        int[] a = new int[10];
        Scanner scan =  new Scanner(System.in);
        int numero = 0, contadorNumeroMaximo = 0;

        for(int i = 0; i < a.length; i++){
            System.out.print("Ingrese un numero de 1 a 9: ");
            a[i] = scan.nextInt();
        }

        for( int i = 0; i < a.length; i++){

            int contadorOcurrencia = 0;
            for( int j = 0; j < a.length; j++){
                if(a[j] == a[i]){
                    contadorOcurrencia++;
                }
            }

            if(contadorOcurrencia > contadorNumeroMaximo){
                numero = a[i];
                contadorNumeroMaximo = contadorOcurrencia;
            }

        }
        System.out.println("La mayor ocurrencias es: "+ contadorNumeroMaximo);
        System.out.println("El elemento que mas se repite es: " + numero);

    }


// Ejercicio resuelto por instructor
/*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arreglo = new int[10];

        // ingreamos los datos por ejemplo {1, 2, 3, 3, 4, 5, 5, 5, 6, 7}
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero de 1 a 9: ");
            arreglo[i] = scanner.nextInt();
        }

        // creamos un segundo arreglo llamado arregloCantidadValores (de igual largo)
        // para guardar las cantidades de veces que se repite cada elemento
        // del arreglo principal
        int[] arregloCantidadValores = new int[10];

        // luego llenamos este segundo arreglo con las cantidades de ocurrencia
        // de los elementos del primer arreglo
        for (int i = 0; i < arreglo.length; i++) {
            int cantidad = 0;
            for (int j = 0; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    cantidad++;
                }
            }
            arregloCantidadValores[i] = cantidad;
        }

        // luego obtenemos el valor de la mayor ocurrencia (mas veces repetido)
        // y el indice o pocicion para obtener el numero mas repetido
        int indice = 0; // indice del elemento con la mayor ocurrencia (mas repetido)
        int max = 0; // la cantidad mayor de veces (la mayor ocurrencia)
        for (int i = 0; i < 10; i++) {
            if (max < arregloCantidadValores[i]) {
                max = arregloCantidadValores[i];
                indice = i;
            }
        }
        System.out.println("La mayor ocurrencia es: " + max);
        System.out.println("El elemento que mas se repite es: " + arreglo[indice]);
        System.out.println("el elemento " + arreglo[indice] + " esta repetido " + max + "veces!");
    }*/
}
