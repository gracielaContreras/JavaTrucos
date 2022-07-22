package poo.tareaProyectoMamiferos.mamifero.felinos;

public class Leon extends Felino{

    private int numManada;
    private double potenciaRugidoDecibel;

    public Leon(float tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Leon(String habitat, float altura, float largo, float peso, String nombreCientifico,
                        float tamanoGarras, int velocidad, int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public Leon(String habitat, float altura, float largo, float peso, float tamanoGarras, int velocidad,
                                                                int numManada, double potenciaRugidoDecibel) {
        super(habitat, altura, largo, peso, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugidoDecibel = potenciaRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotenciaRugidoDecibel() {
        return potenciaRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León caza junto a su grupo de " + this.numManada + " individuos en las llanuras africanas";
    }

    @Override
    public String dormir() {
        return "El León duerme junto a su grupo de  " + this.numManada;
    }

    @Override
    public String correr() {
        return "El León caza y su potencia de rugido es " + this.potenciaRugidoDecibel;
    }

    @Override
    public String comunicarse() {
        return "Los Leones se comunican entre su grupo de manadas en las llanuras africanas al " + habitat;
    }
}
