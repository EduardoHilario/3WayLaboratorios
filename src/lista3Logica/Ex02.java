package lista3Logica;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by eduardohilario on 06/07/17.
 */
public class Ex02 {
    public static void main(String[] args) {
        int[] numero = new int[5];
        int[] numeroInvertido = new int[5];

        //Preencher Vetor
        for (int i=0; i<numero.length;i++){
            System.out.println(numero.length);
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("Informe o "+(i+1)+" número: "));
            numeroInvertido[numero.length - i-1] = numero[i];
        }


        JOptionPane.showMessageDialog(null, "Vetor Informado: "+Arrays.toString(numero)+"\n" +
                "Vetor Invertido: "+Arrays.toString(numero));

    }
}
