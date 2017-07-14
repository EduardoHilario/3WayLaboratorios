package lista2Logica;

import java.util.Scanner;

public class Lista2_logica_ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Informe uma temperatura em Celsius(C): ");
        double c = leia.nextDouble();
        double f = (c*1.8)+32;
        System.out.println("Temperatura: "+f+"º F");
    }

}
