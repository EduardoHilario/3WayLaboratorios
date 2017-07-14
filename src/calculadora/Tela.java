package calculadora;

import javax.swing.*;

/**
 * Created by eduardohilario on 13/07/17.
 */
public class Tela {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário");

        String temp = "";
        for (int i = 0; i < Cargo.values().length; i++){
            temp += (i+1)+" - "+ Cargo.values()[i] + "\n";
        }

        Cargo cargo;

        while(true) {
            try {

                cargo = Cargo.values()[Integer.parseInt(JOptionPane.showInputDialog("" +
                        "Escolha um Cargo: \n" + temp)) - 1];
                break;

            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "ERRO! Tente Novamente");
            }
        }

        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));

        Pessoa funcionario = new Pessoa(nome,cargo,salario);

        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        JOptionPane.showMessageDialog(null,"Nome: " +funcionario.getNome()+
                ".\nSalário Atual: R$ "+funcionario.getSalario()+" reais.\nNovo Salário: R$ "
                +calculadoraSalario.calculaSalario(funcionario),"Novo Salário",1);


    }
}
