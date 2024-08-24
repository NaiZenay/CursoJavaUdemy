package Ejercicios;

import javax.swing.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalcularEdadJ8 {
    public static void main(String[] args) {
        LocalDate born;
        LocalDate now=LocalDate.now();
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("yyyy/MM/dd");
        while (true){
            String fechaNac= JOptionPane.showInputDialog("Ingresa tu fecha de nacimiento formato(yyyy/MM/dd)");
            try {
                born=LocalDate.parse(fechaNac,formato);
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha invalida");
            }
        }
        Period period=Period.between(born,now);
        int edad= period.getYears();
        JOptionPane.showMessageDialog(null,"Tienes "+edad+" anos");




    }
}
