package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex01Logica2 {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número entre 0 e 10"));
        if(x == 10){
            JOptionPane.showMessageDialog(null, "Parabéns! Você Acertou!!");
        }else{
            JOptionPane.showMessageDialog(null,"OPS! Número Errado");
        }
    }

}
