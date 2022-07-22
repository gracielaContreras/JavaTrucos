package poo.tareaProyectoMamiferos.mamifero.felinos;

public class Guepardo extends Felino {

    public Guepardo(float tamanoGarras, int velocidad) {
        super(tamanoGarras, velocidad);
    }

    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                                                                    float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    public Guepardo(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza en su habitat de " + this.habitat + " y tiene un peso " + peso + " y su tamaño " +
                          "de las garras es de " + getTamanoGarras();
    }

    @Override
    public String dormir() {
        return "El Guepardo duerme junto a su grupo de  " + this.habitat;
    }

    @Override
    public String correr() {
        return "El Guepardo caza y su velocidad es de " + this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "Los Guepardo se comunican entre su grupo de manadas en las llanuras africanas y tiene un peso " +
                peso + " y altura " + altura;
    }
}
