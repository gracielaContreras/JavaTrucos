package Java8Features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaximosYMinimos {
    public static void main(String[] args) {

        List<Integer> numers = Arrays.asList(23, 34, 12, 456, 1289, 3, 35);

        //Programación Imperativa
        int min = numers.get(0);
        for (Integer num: numers) {
            if(num < min){
                min = num;
            }
        }
        System.out.println("El numero menor es: " +min);
        //Fin Programación Imperativa

        System.out.println();

        //Programación funcional
       int numeroMenor =  Arrays.asList(23, 34, 12, 456, 1289, 3, 35)
                                            .stream()
                                            .min(Comparator.naturalOrder())
                                            .get();
        System.out.println("El numero menor es: " +numeroMenor);
        //fin Programación funcional
    }
}
