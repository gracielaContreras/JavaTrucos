package poo.interfacesRepositorio.repositorio.excepciones;

public class RegistroDuplicadoAccesoDatoException extends EscrituraAccesoDatoException{
    public RegistroDuplicadoAccesoDatoException(String mensaje){
        super(mensaje);
    }
}
