package Arrays;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Objects;

public class Ordenar {
    public static void main(String[] args) {

        int[] nums = {1, 5, 3, 57, 8, 2};
        int total = nums.length;

        //Ordenar desde la clase de java.util
//        Arrays.sort(nums);

        //bubble sort (no optimizado)
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (nums[i] < nums[j]) {
                    int aux = nums[i];
                    nums[i] = nums[j];
                    nums[i] = aux;
                }
            }
        }

        //bubble sort (optimizados)
        for (int i = 0; i < total - 1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (nums[j] > nums[j+1]) {
                    int aux = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j+1] = aux;
                }
            }
        }

        //Ordenando un array de tipo referencia con bubble sort
        String[] nombres = {"IAN", "ALEX", "MANI", "CARLOS", "JETZEMANI", "ANDREA"};
        int max = nombres.length;
        //bubble sort (optimizados)
        for (int i = 0; i < max - 1; i++) {
            for (int j = 0; j < max - i - 1; j++) {
                if (nombres[j].compareTo(nombres[j + 1]) > 0) {
                    String aux = nombres[j];
                    nombres[j] = nombres[j + 1];
                    nombres[j + 1] = aux;
                }
            }
        }

        //i-esimo
        for (int i = 0; i < total/2; i++) {
            System.out.println("Para cada "+nums[i]+":"+nums[total-1-i]);
        }

        //combinar arreglos en un tercero
        Object[] arr= new Object[(max+total)];
        int maxArr=arr.length;
        int aux=0;

        for (int i = 0; i < maxArr-i-1; i++) {
            arr[aux++]=nums[i];
            arr[aux++]=nombres[i];
        }

        for (Object obj:arr) System.out.println(obj);
        System.out.println();
        for (String nombre : nombres) System.out.println(nombre);
        for (int num : nums) System.out.println(num);
    }
}
