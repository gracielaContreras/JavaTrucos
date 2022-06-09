package ejercicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EjecicioMap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String, Integer> lista = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            lista.put( name, phone );
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
        }

/*        String[][] nombres = new String[1][1];
        nombres[0][1] = "casa";
        nombres[0][2] = "casa2";

        for(String[] fila: nombres){
            for(String columna: fila){
                System.out.println("nombre = " + columna);
            }
        }*/
    }
}



