package poo.interfacesRepositorio.repositorio;

import poo.interfacesRepositorio.modelo.Cliente;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClienteListRepositorio implements CrudRepositorio, OrdenableRepositorio, PaginableRepositorio{

    List<Cliente> datasource;

    public ClienteListRepositorio() {
        this.datasource = new ArrayList<>(); //para inicializar la lista de cliente
    }

    @Override
    public List<Cliente> listar() {
        return datasource;
    }

    @Override
    public Cliente porId(Integer id) {
        Cliente resultado = null;
        for (Cliente cli : datasource){
            if(cli.getId() != null && cli.getId().equals(id)){
                resultado = cli;
                break; //y una vez que encuentre él "id" con el break se sale automáticamente del for
            }
        }

        return resultado;
    }

    @Override
    public void crear(Cliente cliente) {
        this.datasource.add(cliente);
    }

    @Override
    public void modificar(Cliente cliente) {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public void eliminar(Integer id) {
        this.datasource.remove(this.porId(id));
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) { //método de la interfaz OrdenableRepositorio
        List<Cliente> listaOrdenada = new ArrayList<>(this.datasource);
        listaOrdenada.sort(new Comparator<Cliente>() {
            @Override
            public int compare(Cliente a, Cliente b) {
                //sort: Ordena esta lista de acuerdo con el orden inducido por el Comparador especificado.
                int resultado = 0;
                if(direccion == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                }else if (direccion == Direccion.DESC){
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
            }
    });
        return listaOrdenada;
    }

    @Override
    public List<Cliente> listar(int desde, int hasta) { //método de la interfaz PaginableRepositorio
        return datasource.subList(desde, hasta);
    }
}


