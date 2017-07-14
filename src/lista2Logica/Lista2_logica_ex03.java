package lista2Logica;

import java.util.Scanner;

public class Lista2_logica_ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valorCusto, valorVenda, perc;
        System.out.print("Informe o valor de venda do produto: ");
        valorCusto = leia.nextDouble();
        System.out.print("Informe a porcentagem de acréscimo: ");
        perc = leia.nextDouble();
        valorVenda = valorCusto+(valorCusto*perc/100);
        System.out.println("Valor de Venda: R$ "+valorVenda);
    }
}
