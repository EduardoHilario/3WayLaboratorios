package lista2Logica;

import java.util.Scanner;

public class Lista2_logica_ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double valor, prest;
        System.out.print("Informe o valor do produto: ");
        valor = leia.nextDouble();
        prest = valor/5;
        System.out.println("Valor das Prestações: R$ "+prest+" reais");
    }
}
