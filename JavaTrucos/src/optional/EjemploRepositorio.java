package optional;

import optional.repositorio.ComputadorRepositorio;
import optional.repositorio.Repositorio;

public class EjemploRepositorio {
    public static void main(String[] args) {

       Repositorio repo = new ComputadorRepositorio();

       //Forma utilizando Optional
       repo.filtrar("ROG").ifPresentOrElse(System.out::println, //ifPresentOrElse se puede utilizar desde java 9
               () -> System.out.println("No se encontró"));


/*        //Forma tradicional
       Computador pc = repo.filtrar("toshiba");
       if(pc.getNombre() != null){
           System.out.println("Se encontró: " + pc);
       }else{
           System.out.println("No se encontró: " + pc);
           //al no encontrar arroja un error NullPointerException
       }*/


    }
}
