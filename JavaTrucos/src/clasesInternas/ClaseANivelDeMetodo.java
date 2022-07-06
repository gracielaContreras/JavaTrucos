package clasesInternas;

public class ClaseANivelDeMetodo {

    static void foo(){
        class ClaseInternaDeMetodo{
            void bar(){
                System.out.println("Bar");
            }
        }
        ClaseInternaDeMetodo interna = new ClaseInternaDeMetodo();
        interna.bar();
    }
    static void test(){
        // No se puede utilizar la clase interna a nivel de método foo en el método test
        // porque no logra encontrar la clase ClaseInternaDeMetodo
        // ClaseInternaDeMetodo interna = new ClaseInternaDeMetodo();
    }

    public static void main(String[] args) {
        foo();
    }
}
