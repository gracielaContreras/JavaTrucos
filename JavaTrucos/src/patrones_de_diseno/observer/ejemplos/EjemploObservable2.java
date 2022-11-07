package patrones_de_diseno.observer.ejemplos;

import patrones_de_diseno.observer.UsuarioRepositorio;

public class EjemploObservable2 {
    public static void main(String[] args) {
        UsuarioRepositorio repo = new UsuarioRepositorio();

/*      Los observadores son nuestras expresiones lambda que implementan este método update al vuelo que viene de la
        interface functional Observer y los lambda que le pasan por el método addObserver son las implementaciones,*/
        repo.addObserver((o, u) -> System.out.println("Enviando un email al usuario " + u));
        repo.addObserver((o, u) -> System.out.println("Enviando un email al administrador"));
        repo.addObserver((o, u) -> System.out.println("Guardando información del usuario " + u));

        repo.crearUsuario("Eduardo");
    }
}
