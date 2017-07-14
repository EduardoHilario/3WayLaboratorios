package lista4Logica.ex01;

import javax.swing.*;

/**
 * Created by eduardohilario on 10/07/17.
 */
public class Ex01 {
    public static void main(String[] args) {
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Informe a medida do raio"));
        Circunferencia c = new Circunferencia(raio);
        JOptionPane.showMessageDialog(null,"Area = "+c.calculaRaio() );
    }
}
