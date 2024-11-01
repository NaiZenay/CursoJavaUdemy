package Ejercicios.CodeWars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Split_Strings {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(split("wuenass")));

    }

    static public String[] split(String s) {
        if (s.length() % 2 != 0) {
            s += "_";
        }
        String[] split = new String[s.length() / 2];
        for (int i = 0; i < s.length(); i += 2) {
            split[i / 2] = (s.substring(i, i + 2));
        }
        return split;
    }
}

