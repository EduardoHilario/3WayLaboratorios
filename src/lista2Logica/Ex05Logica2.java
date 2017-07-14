package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex05Logica2 {
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um número de 1 a 5"));
        String numeroExtenso;

        switch (numero){
            case 1: numeroExtenso ="Um";
            case 2: numeroExtenso ="Dois";
            case 3: numeroExtenso ="Três";
            case 4: numeroExtenso ="Quatro";
            case 5: numeroExtenso ="Cinco";
            default: numeroExtenso = "!!Número Inválido!!";
        }


    }
}
