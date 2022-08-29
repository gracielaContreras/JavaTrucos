package poo.interfacesRepositorio.repositorio;

import poo.interfacesRepositorio.modelo.BaseEntidad;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractaListRepositorio<T extends BaseEntidad> implements OrdenablePaginableCrudRepositorio<T>{

    protected List<T> datasource;

    public AbstractaListRepositorio() {
        this.datasource = new ArrayList<>(); //para inicializar la lista de cliente
    }

    @Override
    public T porId(Integer id) {
        T resultado = null;
        for (T cli : datasource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break; //y una vez que encuentre él "id" con el break se sale automáticamente del for
            }
        }

        return resultado;
    }
    @Override
    public List<T> listar() {
        return datasource;
    }

    @Override
    public void crear(T t) {
        this.datasource.add(t);
    }

    @Override
    public void eliminar(Integer id) {
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


