package poo.tareaCarroDeSupermercadoGenerico;

public class Lacteo extends Producto{

    private int cantidad;
    private int proteinas;

    public Lacteo(String nombre, Double precio, int cantidad, int proteinas){
        super( nombre, precio );
        this.cantidad =  cantidad;
        this.proteinas = proteinas;
    }

    public int getCantidad() {
        return cantidad;
    }

    public int getProteinas() {
        return proteinas;
    }

    @Override
    public String toString() {
        return "Lacteo: " + nombre +
                ", precio=" + precio +
                ", cantidad= " + cantidad +
                ", proteínas= " + proteinas;
    }
}
