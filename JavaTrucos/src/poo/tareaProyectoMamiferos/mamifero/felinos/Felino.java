package poo.tareaProyectoMamiferos.mamifero.felinos;

import poo.tareaProyectoMamiferos.mamifero.Mamifero;

abstract public class Felino extends Mamifero {

    protected float tamanoGarras;
    protected int velocidad;

    public Felino(float tamanoGarras, int velocidad) {
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico,
                                                                float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public float getTamanoGarras() {
        return tamanoGarras;
    }

    public int getVelocidad() {
        return velocidad;
    }
}
