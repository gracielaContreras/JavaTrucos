package buenasPracticas.ejercicio1;

import java.util.Objects;

public class Fecha {

    /*Comprueba la validez de los parámetros en tus métodos*/

    int dia;
    int mes;
    int año;

    DiaDELASemana diaDELASemana;

    public Fecha(int dia, int mes, int año, DiaDELASemana diaDELASemana) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.diaDELASemana = Objects.requireNonNull(diaDELASemana, "diaDELASemana no puede ser null");
    }

    /**
     * Establece el día del mes
     * @param dia es el día del mes. Este debe estar comprendido entre 1 y 31
     * @throws IllegalArgumentException si dia es menos que 1 o mayor que 31
     */

    public void setDia(int dia) {
        if(dia < 1 || dia > 31){
            throw new IllegalArgumentException("Día: "+ dia + " El día debe estar entre 1 y 31");
        }
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public DiaDELASemana getDiaDELASemana() {
        return diaDELASemana;
    }

    /**
     * metodos privados de comprobacion durante desarrollo
     * @param mes
     * @param year
     */
    private void cuantosDiasTiene(int mes, int year){
        assert mes >= 1 && mes >=12;
    }
}
