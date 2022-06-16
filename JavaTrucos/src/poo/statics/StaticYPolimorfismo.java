package poo.statics;

class A{
    static void foo(){
        System.out.println("Foo");
    }
}
class B extends A{
    static void foo(){
        System.out.println("Foo2");
    }
}
public class StaticYPolimorfismo {
    public static void main(String[] args) {
        A a = new B();
        //Al ser un método static se llama el de la referencia.
        //En este caso llama a clase A porque la invocación no depende de la creación de un objeto.
        //Imprime como resultado: Foo
       a.foo();
    }
}
