package MathClass;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        Random random = new Random();
        int intrandom= random.nextInt();//Genera un valor random que quepa dentro de int
        double doublerandom= random.nextDouble();//Genera un valor random que quepa dentro de double
        float floatrandom= random.nextFloat();//Genera un valor random que quepa dentro de floar

        int random2= random.nextInt(10);//Establece un rango 0-9


    }
}
