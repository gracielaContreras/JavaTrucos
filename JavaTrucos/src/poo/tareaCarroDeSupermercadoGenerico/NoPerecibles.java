package poo.tareaCarroDeSupermercadoGenerico;

public class NoPerecibles extends Producto{

    private int contenido;
    private int calorias;

    public NoPerecibles(String nombre, Double precio, int contenido, int calorias){
        super(nombre, precio);
        this.contenido =  contenido;
        this.calorias = calorias;
    }

    public int getContenido(){
        return contenido;
    }
    public int getCalorias(){
        return calorias;
    }

    @Override
    public String toString() {
        return "NoPerecibles: "+ nombre +
                ", precio= " + precio +
                ", contenido= " + contenido +
                ", calorías= " + calorias;
    }
}
