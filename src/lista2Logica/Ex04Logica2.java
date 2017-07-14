package lista2Logica;

import javax.swing.*;

/**
 * Created by eduardohilario on 05/07/17.
 */
public class Ex04Logica2 {
    public static void main(String[] args) {
        double valorCarro, desconto, valorFinalCarro;
        int anoCarro, contAnoAte2000=0, contTotalCarros=0, continuar;

        do{
            valorCarro = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro"));
            anoCarro = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do carro"));

            if(anoCarro <= 2000){
                desconto = valorCarro*12/100;
                valorFinalCarro = valorCarro - desconto;
                contAnoAte2000++;
            }else{
                desconto = valorCarro*7/100;
                valorFinalCarro = valorCarro - desconto;

            }
            contTotalCarros++;

            JOptionPane.showMessageDialog(null,"Valor do Carro: R$ "+valorCarro+" reais\n" +
                    "Desconto: R$ "+desconto+" reais\nValor Final: R$ "+valorFinalCarro);
            continuar = JOptionPane.showConfirmDialog(null, "Deseja Continuar ?");
        }while(continuar == 0);

        //Relatorios
        JOptionPane.showMessageDialog(null,"Programa Finalizado.\nTotal de carros:" +
                contTotalCarros+"\nTotal de carros ate o ano 2000: "+contAnoAte2000);
    }
}
