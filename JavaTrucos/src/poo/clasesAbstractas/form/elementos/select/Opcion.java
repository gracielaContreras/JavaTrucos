package poo.clasesAbstractas.form.elementos.select;

public class Opcion {

    private String valor;
    private String nombre;
    private boolean selected;

    public Opcion() {
    }

    public Opcion(String valor, String nombre) {
        this.valor = valor;
        this.nombre = nombre;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isSelected() {
        return selected;
    }

    public void setSelected(boolean selected) {
        this.selected = selected;
    }
    //sobrecarga de método. Entonces cada vez que se invoca y no tenga argumento se le asigna un valor true
    public Opcion setSelected() {
        this.selected = true;
        return this;
    }
}
