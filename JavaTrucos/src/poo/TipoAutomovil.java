package poo;

public enum TipoAutomovil {
    SEDAN("Sedan", "Auto mediano", 4),
    STATION_WAGON("Station Wagon", "Auto grande", 4),
    HATCHBACK("Hatchback", "Auto compacto", 4),
    PICKUP("Pickup", "Camioneta", 4),
    COUPE("Coupé", "Auto pequeño", 2),
    CONVERTIBLE("Convertible", "Auto deportivo", 2),
    FURGON("Furgon", "Auto utilitario", 4);

    private final String nombre;
    private final int numeroPuerta;
    private final String description;

    TipoAutomovil( String nombre, String description, int numeroPuerta ) {
        this.nombre = nombre;
        this.numeroPuerta = numeroPuerta;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroPuerta() {
        return numeroPuerta;
    }

    public String getDescription() {
        return description;
    }
}
