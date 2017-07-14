package lista2Logica;

import java.util.Scanner;

public class Lista2_logica_ex01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe o Primeiro número: ");
        int n1 = leia.nextInt();
        System.out.print("Informe o Segundo número: ");
        int n2 = leia.nextInt();
        int soma = n1+n2;
        System.out.println("Soma de "+n1+" + "+n2+" = "+soma);
    }
}
