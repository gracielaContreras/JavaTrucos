package poo.interfacesRepositorio;

import poo.interfacesRepositorio.modelo.Producto;
import poo.interfacesRepositorio.repositorio.OrdenablePaginableCrudRepositorio;
import poo.interfacesRepositorio.repositorio.PaginableRepositorio;
import poo.interfacesRepositorio.repositorio.excepciones.AccesoDatoExeption;
import poo.interfacesRepositorio.repositorio.excepciones.EscrituraAccesoDatoException;
import poo.interfacesRepositorio.repositorio.excepciones.LecturaAccesoDatoException;
import poo.interfacesRepositorio.repositorio.excepciones.RegistroDuplicadoAccesoDatoException;
import poo.interfacesRepositorio.repositorio.lista.ProductoListRepositorio;
import static poo.interfacesRepositorio.repositorio.Direccion.ASC;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {
        try {
            //Crear
            OrdenablePaginableCrudRepositorio<Producto> producto = new ProductoListRepositorio();
            producto.crear(new Producto("Teclado", 50.000));
            producto.crear(new Producto("Mouse", 14.000));
            producto.crear(new Producto("Monitor", 200.000));
            producto.crear(new Producto("Notebook", 900.000));
            producto.crear(new Producto("Audífonos", 40.000));

            //Listar
            producto.listar().forEach(System.out::println);

            //Listar OrdenableRepositorio
            System.out.println("===== OrdenableRepositorio =====");
            System.out.println("==== Por nombre =====");
            //Para poder listar hay que hacer un casteo de OrdenableRepositorio
//        ((OrdenableRepositorio)producto).listar("nombre", ASC).forEach(System.out::println);
            producto.listar("nombre", ASC).forEach(System.out::println);
            System.out.println("==== Por apellido =====");
//        ((OrdenableRepositorio)producto).listar("apellido", ASC).forEach(System.out::println);
            producto.listar("apellido", ASC).forEach(System.out::println);

            //Listar PaginableRepositorio
            System.out.println("===== PaginableRepositorio =====");
            //Para poder listar hay que hacer un casteo de PaginableRepositorio
            ((PaginableRepositorio) producto).listar(1, 4).forEach(System.out::println);
            //desde el índice 1 hasta el índice 4

            //Modificar
            System.out.println("===== editar =====");
            Producto pro = new Producto("Notebook", 800.000);
            pro.setId(4);
            producto.modificar(pro);
            System.out.println("Producto modificado : " + producto.porId(4));
            System.out.println("------listar-----");
            producto.listar().forEach(System.out::println);

            //Eliminar
            System.out.println("===== eliminar =====");
            // cliente.eliminar(4);
            producto.listar().forEach(System.out::println);
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
