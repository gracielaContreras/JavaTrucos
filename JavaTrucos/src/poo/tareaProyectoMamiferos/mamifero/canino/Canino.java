package poo.tareaProyectoMamiferos.mamifero.canino;

import poo.tareaProyectoMamiferos.mamifero.Mamifero;

abstract public class Canino extends Mamifero {

    protected String color;
    protected float tamanoColmillos;

    public Canino(String habitat, float altura, float largo, float peso, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }
}
