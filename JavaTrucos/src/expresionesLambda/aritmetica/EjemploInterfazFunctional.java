package expresionesLambda.aritmetica;

public class EjemploInterfazFunctional {
    public static void main(String[] args) {

        Aritmetica suma = ((a, b) -> a+b);
        Aritmetica resta = ((a, b) -> a-b);

        Calculadora cal = new Calculadora();

        System.out.println(cal.computar(10,5, suma));
        System.out.println(cal.computar(10,5, resta));

        System.out.println(cal.computarconBiFunction(20,5, (a,b) -> a+b));
        System.out.println(cal.computarconBiFunction(30,5, Double::sum));

    }
}
