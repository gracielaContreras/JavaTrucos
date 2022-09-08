package collecciones.tarea;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vuelo {

    private String nombre;
    private String origen;
    private String destino;
    private LocalDateTime fechaHora; //Se utilizó la librería LocalDateTime, ya que 'Date' se encuentra deprecada
    private Integer numDePasajero;

    public Vuelo(String nombre, String origen, String destino, LocalDateTime fechaHora, Integer numDePasajero) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.numDePasajero = numDePasajero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public Integer getNumDePasajero() {
        return numDePasajero;
    }

    @Override
    public String toString() {
        return "Vuelo " +
                "nombre= '" + nombre + '\'' +
                ", origen= '" + origen + '\'' +
                ", destino= '" + destino + '\'' +
                ", fechaHora= " + formateoFecha(fechaHora) +
                ", numDePasajero= " + numDePasajero +
                "\n";
    }

    protected static String formateoFecha(LocalDateTime fecha){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("E MMM dd HH:mm:ss yyyy");
        return fecha.format(formatter);
    }
}
