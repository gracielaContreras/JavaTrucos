package poo.tareaProyectoMamiferos.mamifero.felinos;

public class Tigre extends Felino{

    private String especieTigre;

    public Tigre(float tamanoGarras, int velocidad, String especieTigre) {
        super(tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                                                    float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public Tigre(String habitat, float altura, float largo, float peso, float tamanoGarras,
                                                            int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    public String getEspecieTigre() {
        return especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre caza en su habitat de " + this.habitat + " y tiene un peso " + peso + " y su tamaño " +
                "de las garras es de " + getTamanoGarras();
    }

    @Override
    public String dormir() {
        return "El Tigre duerme junto a su grupo de  " + this.habitat;
    }

    @Override
    public String correr() {
        return "El Tigre caza y su velocidad es de " + this.getVelocidad();
    }

    @Override
    public String comunicarse() {
        return "Los Tigre se comunican entre su grupo de manadas " + getEspecieTigre() + "en las llanuras africanas " +
                "y tiene un peso " + peso + " y altura " + altura;
    }
}
