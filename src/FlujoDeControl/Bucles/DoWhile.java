package FlujoDeControl.Bucles;

public class DoWhile {
    public static void main(String[] args) {
        int count=32;
        char abc;
        //primero ejecuta
        do {
            abc=(char)count;
            System.out.print(abc+" ");
            count++;
            //luego evalua la condicion
        }while (count<127);
    }
}
