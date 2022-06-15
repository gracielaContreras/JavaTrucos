package poo.polimorfismo.figuras;

public class Rectangulo extends Figuras implements Dibujable{

    private double base;
    private double altura;

    public Rectangulo(String color, double base, double altura) {
        super(color);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        //formula : base * altura
        return base*altura;
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando rectangulo");
    }
}
