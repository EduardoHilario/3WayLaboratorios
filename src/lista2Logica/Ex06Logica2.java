package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex06Logica2 {
    public static void main(String[] args) {
        double valorCarro, desconto=0, totalDesconto=0, valorFinalCarro, continuar;
        int combustivel;
        String[] opcoesCombustivel = {"Álcool","Gasolina","Diesel"};

        do {
            //Recebe Informações
            valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro"));
            combustivel = JOptionPane.showOptionDialog(null, "Carango Car", "Escolha um combustivel", 0, JOptionPane.QUESTION_MESSAGE, null, opcoesCombustivel, opcoesCombustivel[2]);

            //Define Desconto
            switch (combustivel) {
                case 0:
                    desconto = valorCarro * 25 / 100;
                case 1:
                    desconto = valorCarro * 21 / 100;
                case 2:
                    desconto = valorCarro * 14 / 100;
            }

            //Calcula Valores
            valorFinalCarro = valorCarro - desconto;
            totalDesconto += desconto;

            //Mostra Resultado
            JOptionPane.showMessageDialog(null,"Valor do Carro: R$ "+valorCarro+" reais\n" +
                    "Desconto: R$ "+desconto+" reais\nValor Final: R$ "+valorFinalCarro);

            continuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar? ");

        }while(continuar == 0);

        //Relatorio Final
        JOptionPane.showMessageDialog(null,"Programa Finalizado.\nTotal de Desconto: R$" +
                ""+totalDesconto+" reais");
    }
}
