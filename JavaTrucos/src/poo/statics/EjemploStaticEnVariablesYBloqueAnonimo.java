package poo.statics;

class SerVivo {
    public SerVivo(){
        System.out.println("Constructor ser vivo");
    }
}


class Humano extends SerVivo{
    static int numeroDeHumanos=0;
    String nombre;

    public Humano() {
        super();
        System.out.println("Constructor");
    }

    public Humano(String nombre) {
        System.out.println("Constructor sobrecargado");
        this.nombre = nombre;
    }

    { //bloque anónimo, se ejecuta antes del constructor
        numeroDeHumanos++;
        System.out.println("bloque anónimo");
    }
}

public class EjemploStaticEnVariablesYBloqueAnonimo {

    public static void main(String[] args) {
        System.out.println(Humano.numeroDeHumanos);

        new Humano();
        new Humano();
        new Humano();
        new Humano();
        System.out.println(Humano.numeroDeHumanos);
    }
}
