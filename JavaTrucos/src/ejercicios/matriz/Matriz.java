package ejercicios.matriz;

public class Matriz {

    private char[][] tablero  = new char[9][12];
    private String[] mat;

    public Matriz(String... matriz) {
       this.mat = matriz;
    }

    public char[][] convertir() {
        for (int i = 0; i < this.tablero.length; i++) {
            char[] sp = this.mat[i].toCharArray();
            for (int j = 0; j < this.tablero[i].length; j++) {
                if (j < sp.length) {
                    this.tablero[i][j] = sp[j];
                } else if (sp.length <= j) {
                    this.tablero[i][j] = '*';
                }
            }
        }
        return tablero;
    }

    public int[] posicion() {
      int[] posiciones = new int[9];

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                if (this.tablero[i][j] == 'R') {
                    posiciones[i] = j;
                    break;
                }
            }
        }
        return posiciones;
    }


    public char[][] acomodar(int[] posiciones) {
        char[][] tableroListo = new char[9][12];

        for (int i = 0; i < this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                if (posiciones[i] == 5) {
                    tableroListo[i][j] = this.tablero[i][j];
                } else if (!(posiciones[i] == 5)) {
                    int resta = 5 - posiciones[i];
                    if (j < resta) {
                        tableroListo[i][j] = '*';
                    } else {
                        tableroListo[i][j] = this.tablero[i][j - resta];
                    }
                }
            }
        }
        return tableroListo;
    }

    public void imprimir(){
        for (int i = 0; i< this.tablero.length; i++) {
            for (int j = 0; j < this.tablero[i].length; j++) {
                System.out.print(this.acomodar(this.posicion())[i][j]);
            }
            System.out.println();
        }
    }
}





