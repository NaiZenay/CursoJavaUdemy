import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        double radio = scanner.nextDouble();
        double area = Math.PI * Math.pow(radio, 2.0);
        System.out.println("El area del circulo es:" + area);
    }

}