package Ejercicios.CodeWars;
//comprobar que una entrada es un palindromo
public class Palindromo {
    public static void main(String[] args) {
        System.out.println(isPalindrome("rotor"));
    }
    static public <T> boolean isPalindrome(T t) {
        String strV = String.valueOf(t);
        char[] arrV = strV.toCharArray();
        int max = arrV.length;
        String reverse = "";
        for (int i = max - 1; i >= 0; i--) {
            reverse += arrV[i];
        }
        return strV.equals(reverse);
    }
}

