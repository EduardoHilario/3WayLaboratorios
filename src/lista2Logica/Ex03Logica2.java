package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex03Logica2 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Informe o nome do aluno");
        String situacao="";
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1"));
        double n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2"));
        double n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3"));
        double media = (n1+n2+n3)/3;


        if(media >= 7){
            situacao = "Aprovado!";
        }else if(media >5){
            situacao = "Recuperação!";
        }else {
            situacao = "Reprovado";
        }

        JOptionPane.showMessageDialog(null,"O aluno "+nome+" foi "+situacao);
    }
}
