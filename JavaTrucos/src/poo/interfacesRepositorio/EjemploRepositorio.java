package poo.interfacesRepositorio;

import poo.interfacesRepositorio.modelo.Cliente;
import poo.interfacesRepositorio.repositorio.*;
import poo.interfacesRepositorio.repositorio.excepciones.AccesoDatoExeption;
import poo.interfacesRepositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import poo.interfacesRepositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo.interfacesRepositorio.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import poo.interfacesRepositorio.repositorio.lista.ClienteListRepositorio;

import static poo.interfacesRepositorio.repositorio.Direccion.ASC;

public class EjemploRepositorio {
    public static void main(String[] args) {
        try {
            //Crear
            OrdenablePaginableCrudRepositorio<Cliente> cliente = new ClienteListRepositorio();
            cliente.crear(new Cliente("Eduardo", "Escobar"));
            cliente.crear(new Cliente("Dina", "Ortiz"));
            cliente.crear(new Cliente("Manuel", "Contreras"));
            cliente.crear(new Cliente("Alvaro", "Contreras"));
            Cliente e = new Cliente("Angela", "Contreras");
            cliente.crear(e);
            cliente.crear(e);

            //cliente.crear(null); ejemplo para error EscrituraAccesoDatoException
            //Listar
            cliente.listar().forEach(System.out::println);

            //Listar OrdenableRepositorio
            System.out.println("===== OrdenableRepositorio =====");
            System.out.println("==== Por nombre =====");
            //Para poder listar hay que hacer un casteo de OrdenableRepositorio
            ((OrdenableRepositorio) cliente).listar("nombre", ASC).forEach(System.out::println);
            System.out.println("==== Por apellido =====");
            ((OrdenableRepositorio) cliente).listar("apellido", ASC).forEach(System.out::println);

            //Listar PaginableRepositorio
            System.out.println("===== PaginableRepositorio =====");
            //Para poder listar hay que hacer un casteo de PaginableRepositorio
            ((PaginableRepositorio) cliente).listar(1, 4).forEach(System.out::println);
            //desde el índice 1 hasta el índice 4

            //Modificar
            System.out.println("===== editar =====");
            Cliente cli = new Cliente("Alvaro", "Ortiz");
            cli.setId(4);
            cliente.modificar(cli);
            System.out.println("Cliente modificado : " + cliente.porId(4));
            System.out.println("------listar-----");
            cliente.listar().forEach(System.out::println);

            //Eliminar
            System.out.println("===== eliminar =====");
            //cliente.eliminar(40); ejemplo para error LecturaAccesoDatoException
            cliente.listar().forEach(System.out::println);
        // registrar del error en orden del más específico al más genérico
        } catch (RegistroDuplicadoAccesoDatoException e){
            System.out.println("Registro Duplicado: " + e.getMessage());
            e.printStackTrace(); //imprime trazabilidad del error
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace(); //imprime trazabilidad del error
        } catch (EscrituraAccesoDatoException e){
            System.out.println("Escritura: " + e.getMessage());
            e.printStackTrace(); //imprime trazabilidad del error
        } catch (AccesoDatoExeption e){
            System.out.println("Genérica: " + e.getMessage());
            e.printStackTrace();
        }

    }
}
