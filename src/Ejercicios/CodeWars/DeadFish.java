package Ejercicios.CodeWars;

import java.util.ArrayList;
import java.util.List;

/*
Write a simple parser that will parse and run Deadfish.

Deadfish has 4 commands, each 1 character long:

i increments the value (initially 0)
d decrements the value
s squares the value
o outputs the value into the return array
Invalid characters should be ignored.
 */

public class DeadFish {
    public static void main(String[] args) {
        for (int num : parse("iiisdoso")) {
            System.out.println(num);
        }
}

    public static int[] parse(String data) {
        List <Integer> result=new ArrayList();
        int initialValue=0;
        for (char command: data.toCharArray()){
            switch(command){
                case 'i':
                    initialValue+=1;
                    break;

                case 'd':
                    initialValue-=1;
                    break;

                case 's':
                    initialValue*=initialValue;
                    break;

                case 'o':
                    result.add(initialValue);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
