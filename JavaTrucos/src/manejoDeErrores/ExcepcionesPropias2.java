package manejoDeErrores;

class TituloIncorrectoException2 extends Exception{
    //excepción de tipo Check, porque hereda de Exception
    public TituloIncorrectoException2(String error) {
        super(error);
    }
}

public class ExcepcionesPropias2 {
    /**
     * Regla de Negocio:
     * Si el nombre del curso no está en mayúscula es incorrecto
     * @param titulo
     */
    static void crearCurso( String titulo) throws TituloIncorrectoException2 {
        if(!titulo.toUpperCase().equals(titulo)){
            //se decio invocar el throws throws TituloIncorrectoException2 porque es una excepción de tipo Check
            throw new TituloIncorrectoException2("El título debe estar en mayúsculas");
        }
        System.out.println("Título correcto");
    }

    public static void main(String[] args) throws TituloIncorrectoException2 {
        crearCurso("Java DESdE CERO A PROFUNDIDAD");
    }
}
