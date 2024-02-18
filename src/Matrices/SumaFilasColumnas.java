package Matrices;

public class SumaFilasColumnas {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < nums.length; i++) {
            int sumaFila=0;
            int sumaColumna=0;
            for (int j = 0; j <nums[i].length ; j++) {
                sumaFila+=nums[i][j];
                sumaColumna+=nums[j][i];

            }
            System.out.println("Resultado de la fila "+i+" "+sumaFila);
            System.out.println("Resultado de la columna "+i+" "+sumaColumna);

        }


    }
}
