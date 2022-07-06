package clasesInternas;

class EjemploAnonima {
    void foo(){
        System.out.println("Foo");
    }
}
public class EjemploClasesAnonimas {
    public static void main(String[] args) {
        EjemploAnonima obj = new EjemploAnonima() {
            @Override
            void foo(){
                //Al sobreescribir el método foo en la clase anónima va a imprimir "Bar"
                System.out.println("Bar");
            }
        };
        obj.foo();
    }
}


