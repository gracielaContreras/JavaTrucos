package poo.tareaProyectoMamiferos.mamifero.canino;

public class Perro extends Canino {

    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String color,
                                                    float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "Los Perros tienen una fuerza de mordida de " + this.getFuerzaMordida();
    }

    @Override
    public String dormir() {
        return "Los Perros les encanta dormir durante el día y tiene un color "+ getColor();
    }

    @Override
    public String correr() {
        return "Los Perros les gusta jugar entre ellos y tiene un tamaño del comillos de " + getTamanoColmillos();
    }

    @Override
    public String comunicarse() {
        return "Los Perros les gusta compartir con los seres humanos en su habitat " + getHabitat()
                + " y  tiene una altura de " + getAltura() + " y peso " + getPeso();
    }
}
