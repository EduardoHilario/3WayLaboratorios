package lista4Logica.ex04;

import javax.swing.*;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class Tela {
    public static void main(String[] args) {
        //define parametros da calculadora
        CalculadoraReserva calculadoraReserva1 = new CalculadoraReserva(15,60,5.5,6,8);
        CalculadoraReserva calculadoraReserva2 = new CalculadoraReserva(20,120,7,8,10);

        //Cria cliente e reserva
        Cliente cliente;
        Reserva reserva;

        //Define parametros de cliente e reserva
        cliente = new Cliente(JOptionPane.showInputDialog("Informe o nome do cliente"));
        reserva = new Reserva(cliente, Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de diarias")));

        //Resultados
        String resp = "";
        resp += "Senhor "+ cliente.getNome()+". Temos duas opções:";
        resp += "\nHotel 1: "+calculadoraReserva1.calculeValorTotal(reserva);
        resp += "\nHotel 2: "+calculadoraReserva2.calculeValorTotal(reserva);

        //Mostra na tela
        JOptionPane.showMessageDialog(null, resp,"decolar.com",1);
    }
}
