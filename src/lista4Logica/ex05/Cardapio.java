package lista4Logica.ex05;

import javax.swing.*;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class Cardapio {

    private Produto[] produtos;


    public void cadastreProdutos(int quantidade){
        produtos = new Produto[quantidade];

        for (int i=0;i<quantidade;i++){
            int codigoProduto = Integer.parseInt(JOptionPane.showInputDialog("Código do Produto"));
            String nomeProduto = JOptionPane.showInputDialog("Nome do Produto");
            double valorProduto = Double.parseDouble(JOptionPane.showInputDialog("Valor do Produto"));
            produtos[i] = new Produto(codigoProduto, nomeProduto, valorProduto);
        }
    }

    public String mostraCardapio(){
        String relatorioProdutos = "";

        for (int i=0; i < produtos.length;i++){
            relatorioProdutos += "\nCodigo: "+produtos[i].getCodigo();
            relatorioProdutos += " | Nome: " +produtos[i].getNome();
            relatorioProdutos += " | Valor: R$ "+ produtos[i].getValor();
        }

        return relatorioProdutos;
    }

    public double buscaValor(int codigo){
        double valor=0;
        for (int i=0; i < produtos.length; i++){
            if(codigo == produtos[i].getCodigo()){
                valor = produtos[i].getValor();

            }
        }
        return valor;
    }


}
