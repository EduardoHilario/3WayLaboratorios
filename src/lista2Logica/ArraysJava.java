package lista2Logica;

import java.util.Arrays;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class ArraysJava {
    public static void main(String[] args) {
        int[] a = {8,3,5,1,2,6,3,2,7,8,2,1};

        //Imprime o array
        System.out.println(Arrays.toString(a));

        //Ordena vetor
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));


        //Busca Indice
        System.out.println(Arrays.binarySearch(a,5));
    }
}
