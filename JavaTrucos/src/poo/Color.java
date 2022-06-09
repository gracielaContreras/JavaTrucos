package poo;

public enum Color {
    ROJO("Rojo"),
    AMARILLO("Amarillo"),
    AZUL("Azul"),
    BLANCO("Blanco"),
    NARANJO("Naranjo");

    private final String color;

    Color(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    @Override
    public String toString(){ //toString es para dar una representación a cada constante
        return this.color;
    }
}
