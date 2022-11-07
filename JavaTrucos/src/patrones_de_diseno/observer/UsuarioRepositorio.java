package patrones_de_diseno.observer;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepositorio extends Observable{
    protected List<String> repo = new ArrayList<>();

    public void crearUsuario(String usuario){
        repo.add(usuario);
        notifyObservers(usuario);
    }

}
