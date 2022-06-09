package poo.clasesAbstractas.form.elementos;

import poo.clasesAbstractas.form.elementos.select.Opcion;
import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElemtosForm{

    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (Opcion opcion : this.opciones){
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.getSelected()){

            }
        }

        return null;
    }
}
