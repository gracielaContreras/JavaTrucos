package arreglos;

public class EjemploArregloOrdenPrincipioFinal {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        int[] a = new int[10];

        for (int i = 0 ; i < numeros.length; i++){
            numeros[i] = i +1;
        }
//        int auxiliar = 0;
        for (int i = 0 ; i < numeros.length /2; i++ ){
/*            a[auxiliar++]  = numeros[i];
            a[auxiliar++]  = numeros[numeros.length -1 -i];*/

            System.out.print(numeros[i] + " "); //1
            System.out.println(numeros[(numeros.length - 1) - i]); //10 - 0 = 10

        }
/*        for (int i = 0 ; i <a.length; i ++){
            System.out.println("i = " + i + " valor: " + a[i]);
        }*/

    }
}
