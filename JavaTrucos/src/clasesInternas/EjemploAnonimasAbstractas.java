package clasesInternas;

abstract class FiguraAnonima {
    abstract void food();
}

public class EjemploAnonimasAbstractas {
    public static void main(String[] args) {
        //Podemos crear objetos de clase abstractas a través de clases anónimas
        FiguraAnonima obj =  new FiguraAnonima() {
            @Override
           public void food() {
                System.out.println("Foo ");
            }
        };
        obj.food();
    }
}
