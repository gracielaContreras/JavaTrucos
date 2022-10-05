package ejercicios.matriz;

public class EjemploMainMatriz {
    public static void main(String[] args) {

        String[] mat = {"VECTOR", "MATRIZ", "PROGRAMA", "SUBPROGRAMA", "SUBPROCESO", "VARIABLE", "ENTERO", "PARA", "MIENTRAS"};

        Matriz matriz = new Matriz(mat);
        matriz.convertir();

        System.out.println("===================== ---------- ================");
        matriz.imprimir();


    }
}
