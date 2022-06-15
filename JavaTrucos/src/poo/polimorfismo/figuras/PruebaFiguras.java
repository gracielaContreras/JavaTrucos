package poo.polimorfismo.figuras;

public class PruebaFiguras {

    //uso del polimorfirmo
    void imprimirArea(Figuras figuras){
        System.out.println("El color de la figura es " + figuras.getColor()+ " y tiene un area de "+ figuras.calcularArea());
    }

    public static void main(String[] args) {

        PruebaFiguras pruebaFiguras = new PruebaFiguras();
        pruebaFiguras.imprimirArea(new Circulo("Rojo", 10.0));
        pruebaFiguras.imprimirArea(new Cuadro("Verde", 125.2));
        pruebaFiguras.imprimirArea(new Rectangulo("Azul", 20, 10));


    }
}
