package matrices.tarea;

import poo.clasesAbstractas.form.validador.Validador;

import java.util.ArrayList;
import java.util.List;

class Integrador{
    int n = 4;
    String[][] matriz = new String[n][n];
//    String muestra = "ACDDCADBCDABDBBA";
    String muestra = "BCDDCADBCDABDBBA";
    int aux=0;
    int validador=0;
    List<String> genZ = new ArrayList<String>();

    public void imprimirMuestra(){

        for( int i = 0; i < matriz.length; i++ ) {

            int auxGenZ = matriz.length;
            char[] caracter =  muestra.toCharArray();

            for (int j = 0; j < matriz[i].length; j++) {
                auxGenZ--;

                if( i == j || i == auxGenZ ){
                    validador++;
                    genZ.add(String.valueOf(caracter[aux]));
                    matriz[i][j] = String.valueOf(caracter[aux]+"z");
                }else {

                    matriz[i][j] = String.valueOf(caracter[aux]);
                }

                System.out.print( matriz[i][j] + "\t" );
                aux++;
            }
            aux = aux;
            System.out.println();
        }


    }
    public void consultaGenZ(){
        if ((n+n) <= validador) {
            for (String l: genZ) {
                //TODO
                //pendiente verificación de vocales
            }
            System.out.println("HAS SALVADO LA HUMANIDAD, ENCONTRASTE EL GEN Z");
        } else {
            System.out.println("LO SIENTO LA HUMANIDAD HA ACABADO");
        }
    }
}

public class EjercicioIntegradorGenZ {

    public static void main(String[] args) {
        Integrador integrador = new Integrador();
        integrador.imprimirMuestra();
        integrador.consultaGenZ();

    }
}
