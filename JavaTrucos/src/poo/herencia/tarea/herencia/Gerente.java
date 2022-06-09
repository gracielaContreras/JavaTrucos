package poo.herencia.tarea.herencia;

public class Gerente extends Empleado{

    private Double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido,numeroFiscal,direccion);
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId, Double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion, empleadoId);
        this.presupuesto = presupuesto;
    }

    public Double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(Double presupuesto) {
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return "presupuesto=" + presupuesto + ", " + super.toString();
    }

}
