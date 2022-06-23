package wrapper;

public class EjemploWrapper {
    public static void main(String[] args) {

        Integer valor = 10; //acá como no es necesario inicializar el objeto
                            // se le conoce como autoboxing
        int in =  valor;
        System.out.println("auto-unboxing : "+ in);

        double v = valor.doubleValue();
        byte b = valor.byteValue();
        System.out.println("byte : " + b);
        float v1 = valor.floatValue();
        System.out.println("float : "+v1);
        long l = valor.longValue();
        System.out.println("long : " +l);

        String s = "10";
        int i = Integer.parseInt(s);
        System.out.println("int : "+i);

        Double aDouble = Double.valueOf(s);
        System.out.println("Double : " +aDouble);


    }
}
