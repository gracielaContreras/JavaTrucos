package poo;

public class Automovil {

    private String fabricante;
    private String modelo;
    private String colo = "gris";
    private double cilindrada;
    private int capacidadEstanque = 40;

    static String patente = "naranja";

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

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
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

    public static String getPatente() {
        return patente;
    }

    public static void setPatente(String patente) {
        Automovil.patente = patente;
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
                ", patente='" + Automovil.patente + '\'' +
                ", colo='" + colo + '\'' +
                ", cilindrada=" + cilindrada +
                ", capacidadEstanque=" + capacidadEstanque +
                '}';
    }
}
