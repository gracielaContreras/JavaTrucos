package poo.clasesAbstractas.form.elementos;

abstract public class ElemtosForm {

    protected String valor;
    protected String nombre;



    public ElemtosForm() {
    }

    public ElemtosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();

}
