package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 06/07/17.
 */
public class Ex09Logica2 {
    public static void main(String[] args) {
        double valorVenda, valorCusto, somaVenda=0, somaCusto=0;
        String situacao="";

        //Recebe a quantidade de produtos
        int quantidadeProdutos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos: "));

        //Main
        for (int i=0; i < quantidadeProdutos; i++){
            valorCusto = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Custo"));
            valorVenda = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor de Venda"));

            //Define Situcação
            if(valorCusto < valorVenda){
                situacao = "Lucro";
            }else if(valorVenda < valorCusto){
                situacao = "Prejuízo";
            }else{
                situacao = "Empate";
            }

            //Soma Valores
            somaCusto += valorCusto;
            somaVenda += valorVenda;

            //Mostra situação
            JOptionPane.showMessageDialog(null,"Neste produto houve "+situacao+",\nem relação ao valor de custo e de venda");
        }

        //Calcula Média
        double mediaVenda = somaVenda/quantidadeProdutos;
        double mediaCusto = somaCusto/quantidadeProdutos;

        //Mostra Resultados
        JOptionPane.showMessageDialog(null,"Média do valor de venda R$ "+mediaVenda+" reais." +
                "\nMédia do valor de Compra R$ "+mediaCusto+" reais.");


    }
}
