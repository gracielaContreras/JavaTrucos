package matrices.tarea;

import java.util.Scanner;

class Palabra {

    public String[][] tablero; //matrices
    public String[] fraces ={ //vector
            "vector","matriz", "programa","subprograma","subproceso","variable","entero","para","mientras"
    };
    public int[] posicionR = new int[9];

        public void inicializarMatriz() {
            tablero = new String[9][12];
            for ( int i = 0; i < tablero.length; i++ ) { //fila
                for ( int j = 0; j < tablero[i].length; j++ ) { //columna
                    tablero[i][j] = "*"; //asignar valores
                }
            }
        }

        public void imprimirMatriz(String[][] tablero) {
            for ( int i = 0; i < tablero.length; i++ ) {
                for ( int j = 0; j < tablero[i].length; j++ ) {
                    System.out.print(tablero[i][j] + "\t");
                }
                System.out.println();
                //Pendiente Tengamos en cuenta que para que no queden pegadas las letras vamos a imprimir un
                //espacio, la letra y otro espacio. Lo hacemos en imprimir para no modificar el contenido de la
                //matriz.
            }
        }
        public void agregarPalabra(String[][] tablero, String recibirPalabra, int posicion) {
            for ( int i = 0; i < tablero.length; i++ ) {
                    if( posicion == i ){
                        char[] caracter =  recibirPalabra.toCharArray();

                        for ( int j = 0; j < tablero[i].length; j++ ) {

                            if(! ( caracter.length <= j ) ){
                                tablero[i][j] = String.valueOf(caracter[j]);
                            } else{
//                                tablero[i][j] = " ";
                            }

                        }
                    }
                }
        }

        public void buscarR(String[][] tablero){
            for ( int i = 0; i <tablero.length; i++ ) {
                for ( int j = 0; j < tablero[i].length; j++ ) {
                    if( "R".equalsIgnoreCase( tablero[i][j] ) ){
                        posicionR[i] = j;
                        break;
                    }
                }
            }
            for ( int i = 0; i < posicionR.length; i++ ) {
                    System.out.println(posicionR[i] + "\t");
            }
        }
        public void acomodarPalabra(String[][] tablero){
            //
            String[][] acomodarPalabra = new String[9][12];
            String palabraInicio, palabraFin;
            buscarR(tablero);
            for (int i = 0; i < tablero.length; i++) {
                for ( int j = 0; j < tablero[i].length; j++ ) {
                    System.out.print(tablero[i][j]+ "\t");
                }
                System.out.println();
            }

        }

}

    public class MatrizAcomodarPalabra {
        public static void main(String[] args) {
            Palabra palabra = new Palabra();
            palabra.inicializarMatriz();

            for (int i = 0; i < 9; i++) {
//                Scanner scan =  new Scanner(System.in);
//                System.out.println("Dime una palabra");
//                String p = scan.nextLine();
//                System.out.println("Dime en que posición quieres agregar la palabra");
//                int posicion = scan.nextInt();
//                palabra.agregarPalabra(palabra.tablero, p, posicion);
                palabra.agregarPalabra(palabra.tablero, palabra.fraces[i], i);
            }
            palabra.imprimirMatriz(palabra.tablero);


            palabra.buscarR(palabra.tablero);

            palabra.acomodarPalabra(palabra.tablero);



        }

}
