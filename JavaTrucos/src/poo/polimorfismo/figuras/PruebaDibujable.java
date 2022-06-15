package poo.polimorfismo.figuras;

public class PruebaDibujable {

    void probarDibujar(Dibujable dibujable){
            dibujable.dibujar();
    }

    public static void main(String[] args) {
        PruebaDibujable pruebaDibujable = new PruebaDibujable();
        pruebaDibujable.probarDibujar(new Circulo("Verde", 10.5f));
        pruebaDibujable.probarDibujar(new Rectangulo("Verde", 10.5f, 10.1f));
        pruebaDibujable.probarDibujar(new Imagen());

        System.out.println(new Circulo("Verde", 10.5f) instanceof Dibujable);
    }
}
