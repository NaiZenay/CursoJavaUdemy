package Ejercicios.CodeWars;
import java.util.TreeMap;

public class RomanNumeral {
    static TreeMap<Integer, String> romanNumbers = new TreeMap<>();
    //fk this
    public static void main(String[] args) {
        romanNumbers.put(1000,"M");
        romanNumbers.put(900,"CM");
        romanNumbers.put(500,"D");
        romanNumbers.put(400,"CD");
        romanNumbers.put(100,"C");
        romanNumbers.put(90,"XC");
        romanNumbers.put(50,"L");
        romanNumbers.put(40,"XL");
        romanNumbers.put(10,"X");
        romanNumbers.put(5,"V");
        romanNumbers.put(4,"IV");
        romanNumbers.put(1,"I");
        int number = 954;
        System.out.println(answer(number));
    }
    static public String answer(int number) {
        Integer key = romanNumbers.floorKey(number);
        if (key==number){
            return romanNumbers.get(key);
        }
        return romanNumbers.get(key) + answer(number-key);
    }
}

