package poo.clasesAbstractas.form.elementos;

import poo.clasesAbstractas.form.validador.LargoValidador;
import poo.clasesAbstractas.form.validador.Validador;
import poo.clasesAbstractas.form.validador.mensaje.MensajeFormateable;

import java.util.ArrayList;
import java.util.List;

abstract public class ElemtosForm {

    protected String valor;
    protected String nombre;

    private List<Validador> validadores;
    private List<String> errores;

    public ElemtosForm() {
        //inicializamos validadores y errores
        this.validadores = new ArrayList<>();
        this.errores = new ArrayList<>();
    }

    public ElemtosForm(String nombre) {
        this();
        this.nombre = nombre;
    }

    public ElemtosForm addValidador(Validador validador){
        this.validadores.add(validador);
        return this;
    }

    public List<String> getErrores() {
        return errores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public boolean esValido(){
        for(Validador v: validadores){
            if (! v.esValido(this.valor)){
                if(v instanceof MensajeFormateable){
                    this.errores.add(((LargoValidador) v).getMensajeFormateado(nombre));
                }else {
                    this.errores.add(String.format(v.getMensaje(), nombre));
                }
            }
        }
        return this.errores.isEmpty(); //esta vacío o no
    }

    abstract public String dibujarHtml();
}
