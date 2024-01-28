package Arrays;

public class Inicializacion {
    public static void main(String[] args) {
        //Los array son un tipo de dato de referencia para hacer array de valore primitivos de realiza un autoUnboxing
        int [] arrNums = new int[5];
        //tipo de dato          tamaño del arreglo

        //Almacenar valores (segun posicion)
        arrNums[0]=1;//Posicion 0 almacena el valor 1
        arrNums[1]=1;//Posicion 1 almacena el valor 1
        arrNums[2]=1;//Posicion 2 almacena el valor 1
        arrNums[3]=1;//Posicion 3 almacena el valor 1
        arrNums[4]=1;//Posicion 4 almacena el valor 1

        String[] arrStrings= new String[5];
        arrStrings[0]="ian";
        arrStrings[1]="andy";
        arrStrings[2]="mani";
        arrStrings[3]="carlos";
        arrStrings[4]="alex";

        //otra forma de inicializar y asignar valores
        char [] chars={'a','b','c','d','e'};

    }
}
