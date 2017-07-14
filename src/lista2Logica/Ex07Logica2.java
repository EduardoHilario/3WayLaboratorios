package lista2Logica;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex07Logica2 {
    public static void main(String[] args) {
        double salario, salarioMinimo, novoSalario=0, reajuste=0, totalReajuste=0;
        int quantidadeFuncionario, continuar=0;
        String nome;


            quantidadeFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de funcionarios"));
            salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do salário mínimo"));

            for (int i=0; i<quantidadeFuncionario;i++){
                nome = JOptionPane.showInputDialog("informe o nome do "+(i+1)+"º Funcionario").toUpperCase();
                salario = Double.parseDouble(JOptionPane.showInputDialog("Valor do salário do funcionário "+nome));

                //Calcula Reajuste
                if(salario < salarioMinimo*3){
                    reajuste = salario*50/100;
                }else if (salario <= salarioMinimo*10){
                    reajuste = salario*20/100;
                }else if (salario <= salarioMinimo*20){
                    reajuste = salario*15/100;
                }else{
                    reajuste = salario*10/100;
                }
                totalReajuste += reajuste;
                novoSalario = salario + reajuste;

                //Resultado
                JOptionPane.showMessageDialog(null,"Relatório de Reajuste\nFuncionário: "+nome
                +"\nReajuste: R$ "+reajuste+" reais\nNovo Salário: R$ "+novoSalario+" reais");


            }

        //Relatorio Final
        JOptionPane.showMessageDialog(null,"Programa Finalizado.\nTotal de Reajuste: R$" +
                ""+totalReajuste+" reais");
    }
}
