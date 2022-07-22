package poo.tareaProyectoMamiferos.mamifero.canino;

public class Lobo extends Canino {

    private int numCamada;
    private String especieLobo;

    public Lobo(String habitat, float altura, float largo, float peso, String color,
                                        float tamanoColmillos, int numCamada, String especieLobo) {
        super(habitat, altura, largo, peso, color, tamanoColmillos);
        this.numCamada = numCamada;
        this.especieLobo = especieLobo;
    }

    public int getNumCamada() {
        return numCamada;
    }

    public String getEspecieLobo() {
        return especieLobo;
    }

    @Override
    public String comer() {
        return "El Lobo caza junto a su grupo de " + this.getNumCamada() + " individuos en las las cavernas de "
                                            + this.getHabitat();
    }

    @Override
    public String dormir() {
        return "El Lobo " + this.getColor() + " duerme en las cavernas de " + this.getHabitat();
    }

    @Override
    public String correr() {
        return "El Lobo le gusta correr con su grupo de camada de " + this.getNumCamada();
    }

    @Override
    public String comunicarse() {
        return "Los Lobos solo se comunican con su mismo grupo y en su " + this.getHabitat()
                                + " y  tiene una altura de " + getAltura() + " y peso " + getPeso();
    }
}
