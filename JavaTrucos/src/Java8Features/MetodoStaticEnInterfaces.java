package Java8Features;

interface Promocion{
    void init();
    default void iniciarPromocion(){
        System.out.println("Este es un método generico para promociones");
    };
    static void getPromocion(){
        System.out.println("Bienvenido a la promoción");
    }
}
class Ofertas implements Promocion{
    @Override
    public void init() {
        System.out.println("Bienvenido a las ofertas");
    }
    @Override
    public void iniciarPromocion() {
        System.out.println("inicio");
    }
}

public class MetodoStaticEnInterfaces {
    public static void main(String[] args) {
        new Ofertas().init();
        new Ofertas().iniciarPromocion();
        Promocion.getPromocion();

    }
}
