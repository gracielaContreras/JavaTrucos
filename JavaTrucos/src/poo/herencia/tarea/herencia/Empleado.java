package poo.herencia.tarea.herencia;

public class Empleado extends Persona{

    private Double remuneracion;
    private int empleadoId;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido,numeroFiscal,direccion);
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, Double remuneracion, int empleadoId){
        super(nombre, apellido,numeroFiscal,direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = empleadoId;
    }

    public Double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(Double remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void setEmpleadoId(int empleadoId) {
        this.empleadoId = empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += remuneracion*porcentaje/100;
    }

    @Override
    public String toString() {
        return "empleadoId=" + empleadoId + ", remuneracion=" + remuneracion + ", " + super.toString();
    }
}
