package ejercicios;

/**
 * Create a function that takes an integer as an argument and
 * returns "Even" for even numbers or "Odd" for odd numbers.
 */
public class ParImpar {
    public static void main(String[] args) {
        even_or_odd(6);
    }
    public static String even_or_odd(int number) {
        //Place code here
        return (number%2 ==0) ? "Even" : "Odd";
    }
}
