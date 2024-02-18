package Matrices;

public class MatrizIdentidad {
    public static void main(String[] args) {
        int nums[][] = new int[5][5];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i==j){
                    nums[i][j]=1;
                }else {
                    nums[i][j]=0;
                }
            }
        }

        for (int[] fila : nums) {
            for (int columna : fila) {
                System.out.print(columna + " ");
            }
            System.out.println();
        }
    }
}
