package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 06/07/17.
 */

public class DesafioLogica2 {

    //Metodo para mostrar erro na tela
    static void erro(int tipo){//Tipos de erro : 1-divisao por 0, 2-operador invalido
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(null, "!!ERRO!!\nDivisão por 0");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "!!ERRO!!\nOperador Inválido");
                break;
        }
    }

    //Metodo que realiza operações matemáticas
    static void operacoes(int n1, int n2, char op) {
        double resultado=0;
        switch (op) {
            case '+':
                resultado = n1 + n2;
            break;
            case '-':
                resultado = n1 - n2;
            break;
            case '*':
                resultado = n1 * n2;
            break;
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                } else {
                    erro(1);
                }
                break;
            default:
                erro(2);

        }
        if(op != '/' && n2 != 0) {
            JOptionPane.showMessageDialog(null, n1+" "+op+" "+n2+" = "+resultado);
        }
    }

    //main
    public static void main(String[] args) {
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número"));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número"));
        String operador = JOptionPane.showInputDialog("Informe o operador: [+,-,*,/").toLowerCase();

        if(operador.length() == 1){
            char op = operador.charAt(0);
            operacoes(n1,n2,op);
            }else{
            erro(2);
        }
    }
}
