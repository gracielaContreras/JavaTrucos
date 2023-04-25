package Java8Features.streams;

import java.util.stream.IntStream;

public class PrimitiveStreams {
    public static void main(String[] args) {
        //Programación Imperativa
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }

        System.out.println();

        //Programación funcional
        IntStream.range(0, 10).forEach(System.out::print);
    }
}
