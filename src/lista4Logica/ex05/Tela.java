package lista4Logica.ex05;

import javax.swing.*;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class Tela {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        Caixa caixa = new Caixa(cardapio);

        cardapio.cadastreProdutos(Integer.parseInt(JOptionPane.showInputDialog("Quantidade de produtos: ")));

        double valorTotal = caixa.realizaVenda();
        JOptionPane.showMessageDialog(null, "Venda Finalizada!\nR$ "+valorTotal+" reais");
    }
}
