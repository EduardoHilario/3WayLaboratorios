package lista4Logica.ex05;

import javax.swing.*;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class Caixa {
    private Cardapio cardapio;

    public Caixa(Cardapio cardapio) {
        this.cardapio = cardapio;
    }

    public double realizaVenda(){
        double valorTotal=0;
        int codigo =0;
        do {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Escolha o produto pelo codigo" +
                    cardapio.mostraCardapio() +
                    "\nDigite 0 para finalizar!"));
            valorTotal += cardapio.buscaValor(codigo);
        }while(codigo != 0);
        return valorTotal;
    }
}
