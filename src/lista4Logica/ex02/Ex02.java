package lista4Logica.ex02;

import javax.swing.*;

/**
 * Created by eduardohilario on 10/07/17.
 */
public class Ex02 {
    public static void main(String[] args) {
        //Cria Objeto RelatorioSalarial
        RelatorioSalarial s = new RelatorioSalarial();

        //Entrada de informações
        s.setQuantidadeHorasTrabalhadas(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de horas trabalhadas.")));
        s.setValorHoraTrabalhada(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da hora trabalhada")));
        s.setPercentualDesconto(Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto")));

        //Metodos
        s.calculeSalarioBruto();
        s.calculeDesconto();
        s.calculeSalarioLiquido();

        //Obtem Parametros
        String resultado = "Horas Trabalhadas: "+String.valueOf(s.getQuantidadeHorasTrabalhadas());
        resultado += "\nSalário Bruto: R$ "+String.valueOf(s.getSalarioBruto());
        resultado += "\nDesconto: R$ "+String.valueOf(s.getDesconto());
        resultado += "\nSalário Líquido: R$ "+String.valueOf(s.getSalarioLiquido());

        //Mostra na Tela
        JOptionPane.showMessageDialog(null,resultado,"Relatório",JOptionPane.INFORMATION_MESSAGE);


    }
}
