package poo.interfacesRepositorio.repositorio;

import poo.interfacesRepositorio.modelo.BaseEntidad;
import poo.interfacesRepositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import poo.interfacesRepositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo.interfacesRepositorio.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntidad> implements OrdenablePaginableCrudRepositorio<T>{

    protected List<T> datasource;

    public AbstractaListRepositorio() {
        this.datasource = new ArrayList<>(); //para inicializar la lista de cliente
    }

    @Override
    public T porId(Integer id) throws LecturaAccesoDatoException {
        if(id == null || id <= 0){
            throw new LecturaAccesoDatoException("Id inválido debe ser > 0");
        }
        T resultado = null;
        for (T cli : datasource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break; //y una vez que encuentre él "id" con el break se sale automáticamente del for
            }
        }
        if(resultado == null){
            throw new LecturaAccesoDatoException(("No existe el registro con el id ") + id);
        }

        return resultado;
    }
    @Override
    public List<T> listar() {
        return datasource;
    }

    @Override
    public void crear(T t) throws EscrituraAccesoDatoException{
        if (t == null) {
            throw new EscrituraAccesoDatoException("Error al insertar valor null");
        }
        if( this.datasource.contains(t)){
            throw new RegistroDuplicadoAccesoDatoException("Error el objeto con el id: "+
                    t.getId() + " existe en el repositorio");
        }
        this.datasource.add(t);
    }

    @Override
    public void eliminar(Integer id) throws LecturaAccesoDatoException {
        this.datasource.remove(this.porId(id));
    }

    @Override
    public List<T> listar(int desde, int hasta) { //método de la interfaz PaginableRepositorio
        return datasource.subList(desde, hasta);
    }

    @Override
    public int total(){
        return this.datasource.size();
    }
}


