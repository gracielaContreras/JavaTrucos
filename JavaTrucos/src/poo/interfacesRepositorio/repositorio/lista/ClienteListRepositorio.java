package poo.interfacesRepositorio.repositorio.lista;

import poo.interfacesRepositorio.modelo.Cliente;
import poo.interfacesRepositorio.repositorio.AbstractaListRepositorio;
import poo.interfacesRepositorio.repositorio.Direccion;
import poo.interfacesRepositorio.repositorio.excepciones.AccesoDatoExeption;
import poo.interfacesRepositorio.repositorio.excepciones.LecturaAccesoDatoException;

import java.util.ArrayList;
import java.util.List;

public class ClienteListRepositorio extends AbstractaListRepositorio<Cliente> {

    @Override
    public void modificar(Cliente cliente) throws LecturaAccesoDatoException {
        Cliente cli = this.porId(cliente.getId());
        cli.setNombre(cliente.getNombre());
        cli.setApellido(cliente.getApellido());
    }

    @Override
    public List<Cliente> listar(String campo, Direccion direccion) { //método de la interfaz OrdenableRepositorio
        List<Cliente> listaOrdenada = new ArrayList<>(this.datasource);
        listaOrdenada.sort((a, b) -> {
                int resultado = 0;
                if(direccion == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                }else if (direccion == Direccion.DESC){
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
    });
        return listaOrdenada;
    }

    public static int ordenar(String campo, Cliente a, Cliente b){
        int resultado = 0;
        switch (campo) {
            case "id" -> resultado = a.getId().compareTo(b.getId());
            case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
        }
        return resultado;
    }
}


