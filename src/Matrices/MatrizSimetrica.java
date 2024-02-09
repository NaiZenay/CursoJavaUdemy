package Matrices;

public class MatrizSimetrica {
    public static void main(String[] args) {
        int[][] nums = {
                {1, 2, 3},
                {2, 1, 3},
                {3, 3, 3}
        };

        boolean simetrica = true;

        salir:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                //SI LA MATRIZ ES IGUAL A SU TRANSPUESTA ENTONCES ES SIMETRICA
                if (nums[i][j] != nums[j][i]) {
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica){
            System.out.println("La matriz es simetrica");
        }else{
            System.out.println("Lamatriz no es simetrica");
        }

    }
}
