package manejoDeErrores;

class TituloIncorrectoException extends RuntimeException{
    public TituloIncorrectoException(String error) {
        super(error);
    }
}
public class ExcepcionesPropias {
    /**
     * Regla de Negocio:
     * Si el nombre del curso no está en mayúscula es incorrecto
     * @param titulo
     */
    static void crearCurso( String titulo){
        if(!titulo.toUpperCase().equals(titulo)){
            //excepción de tipo Unchecked, porque hereda de RuntimeException
            throw new TituloIncorrectoException("El título debe estar en mayúsculas");
        }
        System.out.println("Título correcto");
    }

    public static void main(String[] args) {
        crearCurso("Java DESdE CERO A PROFUNDIDAD");
    }
}
