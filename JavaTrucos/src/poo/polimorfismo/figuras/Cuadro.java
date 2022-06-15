package poo.polimorfismo.figuras;

public class Cuadro extends Figuras{

    private double lado;

    public Cuadro(String color, double lado) {
        super(color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        //formula: lado por lado
        return lado*lado;
    }
}
