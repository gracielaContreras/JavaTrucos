package expresionesLambda.aritmetica;

import java.util.function.BiFunction;

public class Calculadora {
    public double computar(double a, double b, Aritmetica lambda){
        return lambda.operacion(a, b);
    }
    public double computarconBiFunction(double a, double b, BiFunction<Double,Double,Double> lambda){
        return lambda.apply(a, b);
    }
}
