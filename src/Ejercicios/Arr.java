package Ejercicios;

public class Arr {
    public static void main(String[] args) {
        int [] nums ={1,2,3,4,5};
        int[]nums2=nums;
        nums2[2]=10;
        //Que pasa??
        for (int num: nums) {
            System.out.println(num);
        }
    }
}
