package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex02Logica2 {
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro"));
        if(n1 > n2){
            JOptionPane.showMessageDialog(null,"O número "+n1+" é maior que "+n2);
        }else{
            JOptionPane.showMessageDialog(null,"O número "+n2+" é maior que "+n1);
        }
    }
}
