package poo.polimorfismo.figuras;

public class Circulo extends Figuras implements Dibujable{

    private double radio;

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        // formula: pi*radio al cuadrado
        return Math.PI*Math.pow(radio, 2);
    }

    void rodar(){
        System.out.println("El circulo " + getColor()+ " esta rodando");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando un circulo");
    }
}
