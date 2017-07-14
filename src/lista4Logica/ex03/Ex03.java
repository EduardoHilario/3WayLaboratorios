package lista4Logica.ex03;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by eduardohilario on 10/07/17.
 */
public class Ex03 {
    public static void main(String[] args) {
        double[] vetor = {2, 1, 3};

        inverta(vetor, 0,1);
        inverta(vetor, 0,2);
        inverta(vetor, 1,2);

        mostraVetor(vetor);
    }

    private static void mostraVetor(double[] vetor){
        for (int i=0;i<vetor.length;i++){
            System.out.println(vetor[i]);
        }
    }

    private static int compare(double e1, double e2){
        if(e1 > e2){
            return 1;
        }else if (e1 < e2){
            return -1;
        }
            return 0;
    }

    private static void inverta(double[] vetor, int i, int j){

        if(compare(vetor[i],vetor[j])>0) {
            double temp = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = temp;
        }
    }


}
