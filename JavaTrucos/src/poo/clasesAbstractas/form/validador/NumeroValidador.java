package poo.clasesAbstractas.form.validador;

public class NumeroValidador extends Validador{

    protected String mensaje = "el campo %s debe ser número";
    @Override
    public void setMensaje(String mensaje) {
        this.mensaje=mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor); //convertir valor a un entero
            return true;
        }catch (NumberFormatException e){
            return false;
        }
    }
}
