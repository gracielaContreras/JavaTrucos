package date_time;

import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {
        LocalDate fecha1 = LocalDate.of(2021,10,11);
        LocalDate fecha2 = LocalDate.of(2022,12,25);
        LocalDate fecha3 = fecha2.withMonth(12);

        Period periodo = Period.between(fecha1, fecha2);
        System.out.println("periodo = " + periodo);

        System.out.printf("Periodo entre %s y %s hay %d años, %d meses y %d días"
                            , fecha1, fecha3, periodo.getYears(), periodo.getMonths(), periodo.getDays());
    }
}
