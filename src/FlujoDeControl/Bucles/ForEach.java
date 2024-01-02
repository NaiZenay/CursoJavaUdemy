package FlujoDeControl.Bucles;

public class ForEach {
    public static void main(String[] args) {
        //solo funciona sobre objetos "iterable"

        int[] nums ={1,2,3,4,5,6,7,8};
//        variable temp | objeto iterable
        for (int num : nums){
            //accion
            System.out.println("num = " + num);
        }

        System.out.println();
        
        char[] chars = {'a','d','a','s','y'};
//        variable temp | objeto iterable
        for ( char caracter : chars){
            //accion
            System.out.println("caracter = " + caracter);
        }
    }
}
