package calculadoraV2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by eduardohilario on 13/07/17.
 */
public class Tela {
    public static void main(String[] args) {


        //Define parametros para os Cargos
        Cargo.DESENVOLVEDOR.setSalario(new double[]{2200,3000,4600});
        Cargo.DESENVOLVEDOR.setFaixaReajuste(new double[]{8,6.5,5,3});

        Cargo.DESIGNER.setSalario(new double[]{1950,2400});
        Cargo.DESIGNER.setFaixaReajuste(new double[]{10,8.2,5});

        Cargo.VENDEDOR.setSalario(new double[]{1200,2000});
        Cargo.VENDEDOR.setFaixaReajuste(new double[]{15,12,9});

        Cargo.GERENTE.setSalario(new double[]{3150,4200});
        Cargo.GERENTE.setFaixaReajuste(new double[]{9,7.5,6});


        //Define nome do funcionário
        String nome = JOptionPane.showInputDialog("Informe o nome do funcionário");

        //Lista os cargos disponiveis
        String temp = "";
        for (int i = 0; i < Cargo.values().length; i++){
            temp += (i+1)+" - "+ Cargo.values()[i] + "\n";
        }

        Cargo cargo;

        //Solicita o cargo e valida a entrada
        while(true) {
            try {

                cargo = Cargo.values()[Integer.parseInt(JOptionPane.showInputDialog("" +
                        "Escolha um Cargo: \n" + temp)) - 1];
                break;

            } catch (NumberFormatException | IndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null, "ERRO! Tente Novamente");
            }
        }

        //Solicita o salario atual
        double salarioAtual = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));

        //Cria o funcionario
        Pessoa funcionario = new Pessoa(nome,cargo,salarioAtual);

        //Calcula e mostra o novo salario
        CalculadoraSalario calculadoraSalario = new CalculadoraSalario();
        JOptionPane.showMessageDialog(null,
                "Nome: " +funcionario.getNome()+
                ".\nSalário Atual: R$ "+funcionario.getSalario()+" reais." +
                "\nReajuste: R$ "+calculadoraSalario.calculaReajuste(funcionario) +
                "\nNovo Salário: R$ " +calculadoraSalario.calculeSalario(funcionario),
                "Novo Salário",1);


    }
}
