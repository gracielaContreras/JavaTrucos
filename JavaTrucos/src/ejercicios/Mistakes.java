package ejercicios;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
public class Mistakes {
    public static void main(String[] args) {

        concurrentModificationException();
        nulls_optionals();

    }
    private static void concurrentModificationException(){
        ArrayList<String>words = new ArrayList<>(
                Arrays.asList("a","b","c","d")
        );
        words.forEach(word -> {
            if (words.equals("a")) {
                words.remove(word); //no puede eliminar mientras recorre la lista
            }
        });
        words.forEach(System.out::println);

        System.out.println("...............");

        //Solution
        System.out.println("Option 1°");
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if (word.equals("a")) {
                iterator.remove();
            }
        }
        words.forEach(System.out::println);
        System.out.println("...............");

        System.out.println("Option 2°");
        words.removeIf(word -> word.equals("a"));
        words.forEach(System.out::println);


    }

    private static void generics(){
        List<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(10);
        listOfNumbers.forEach(
                n -> System.out.println( n * 2 ));
    }
    private String ternary(int age){
        return age >= 18 ? "Adult" : "Child";
    }
    private static void free_resources() throws IOException{
        try(FileInputStream input = new FileInputStream("file.txt")){
            int data = input.read();

            while (data != 1){
                System.out.println((char) data);
                data = input.read();
            }
        }
    }
    private static Optional<Character> nulls_optionals(){
        String name = null;
        if(name == null){
            return Optional.empty();
        }
        return Optional.of(name.charAt(0));
    }
}
