package Java8DateTime;


import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;

public class EjemploPeriod {
    public static void main(String[] args) {

        LocalDate fecha1 = LocalDate.of(2011, 9, 22);
        LocalDate fecha2 = LocalDate.now();
        Period period = Period.between(fecha1, fecha2);
        System.out.println("period = " + period);
        System.out.printf("Han pasado %d años %d meses %d dias",period.getYears(),period.getMonths(),period.getDays());
    }
}
