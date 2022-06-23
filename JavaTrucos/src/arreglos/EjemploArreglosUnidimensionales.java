package arreglos;

public class EjemploArreglosUnidimensionales {
    public static void main(String[] args) {
        int array[] = new int[3];
        array[0] = 25;
        array[1] = 20;
        array[2] = 30;

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("************************");
        // Otra forma de recorrerlo
        int i = 0;
        while (i < array.length){
            System.out.println(array[i]);
            i++;
        }
        System.out.println("************************");
        // Otra forma de recorrerlo
        for (int temp: array) {
            System.out.println(temp);
        }
    }
}
