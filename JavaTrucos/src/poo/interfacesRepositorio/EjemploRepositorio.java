package poo.interfacesRepositorio;

import poo.interfacesRepositorio.modelo.Cliente;
import poo.interfacesRepositorio.repositorio.*;
import poo.interfacesRepositorio.repositorio.lista.ClienteListRepositorio;

import static poo.interfacesRepositorio.repositorio.Direccion.ASC;

public class EjemploRepositorio {
    public static void main(String[] args) {

        //Crear
        OrdenablePaginableCrudRepositorio<Cliente> cliente =  new ClienteListRepositorio();
        cliente.crear(new Cliente("Eduardo", "Escobar"));
        cliente.crear(new Cliente("Dina", "Ortiz"));
        cliente.crear(new Cliente("Manuel", "Contreras"));
        cliente.crear(new Cliente("Alvaro", "Contreras"));
        cliente.crear(new Cliente("Angela", "Contreras"));

        //Listar
        cliente.listar().forEach(System.out::println);

        //Listar OrdenableRepositorio
        System.out.println("===== OrdenableRepositorio =====");
        System.out.println("==== Por nombre =====");
        //Para poder listar hay que hacer un casteo de OrdenableRepositorio
        ((OrdenableRepositorio)cliente).listar("nombre", ASC).forEach(System.out::println);
        System.out.println("==== Por apellido =====");
        ((OrdenableRepositorio)cliente).listar("apellido", ASC).forEach(System.out::println);

        //Listar PaginableRepositorio
        System.out.println("===== PaginableRepositorio =====");
        //Para poder listar hay que hacer un casteo de PaginableRepositorio
        ((PaginableRepositorio) cliente).listar(1,4).forEach(System.out::println);
                                                //desde el índice 1 hasta el índice 4

        //Modificar
        System.out.println("===== editar =====");
        Cliente cli =  new Cliente("Alvaro", "Ortiz");
        cli.setId(4);
        cliente.modificar(cli);
        System.out.println("Cliente modificado : " +cliente.porId(4));
        System.out.println("------listar-----");
        cliente.listar().forEach(System.out::println);

        //Eliminar
        System.out.println("===== eliminar =====");
       // cliente.eliminar(4);
        cliente.listar().forEach(System.out::println);

    }
}
