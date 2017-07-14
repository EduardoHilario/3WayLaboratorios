package lista2Logica;

import java.util.Scanner;

public class Lista2_logica_desafio {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o valor de Fábrica do carro: R$ ");
        double valorF = leia.nextDouble();
        double valorV = valorF*1.45;
        valorV = valorV*1.28;
        System.out.println("Valor final de venda: R$ "+valorV+" reais");
    }
}
