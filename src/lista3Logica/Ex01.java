package lista3Logica;

import javax.swing.*;
import java.util.Arrays;

/**
 * Created by eduardohilario on 06/07/17.
 */
public class Ex01 {
    public static void main(String[] args) {
        int[] numero = new int[30];

        for (int i=0; i<numero.length;i++){
            numero[i] = i*i;
        }

        JOptionPane.showMessageDialog(null, Arrays.toString(numero));

    }

}
