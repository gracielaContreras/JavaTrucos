package poo;

public class Automovil {

    private String fabricante;
    private String modelo;
    private Color colo = Color.NARANJO;
    private double cilindrada;
    private int capacidadEstanque = 40;
    private TipoAutomovil tipo;

    static Color patente = Color.ROJO;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColo() {
        return colo;
    }

    public void setColo(Color colo) {
        this.colo = colo;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    public int getCapacidadEstanque() {
        return capacidadEstanque;
    }

    public void setCapacidadEstanque(int capacidadEstanque) {
        this.capacidadEstanque = capacidadEstanque;
    }

    public static Color getPatente() {
        return patente;
    }

    public static void setPatente(Color patente) {
        Automovil.patente = patente;
    }

    public TipoAutomovil getTipo() {
        return tipo;
    }

    public void setTipo(TipoAutomovil tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){  //comparamos por referencia
            return true;
        }
        if(!(obj instanceof Automovil)){  //compara si son del mismo tipo de objeto
            return false;
        }
        Automovil a = (Automovil) obj;
        return (this.fabricante != null && this.modelo != null
                && this.fabricante.equals(a.getFabricante())
                && this.modelo.equals(a.getModelo()));
    }

    //toString: es una representación de salida de un string


    @Override
    public String toString() {
        return "Automovil{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", patente='" + Automovil.patente + '\'' +
                ", colo='" + colo + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
