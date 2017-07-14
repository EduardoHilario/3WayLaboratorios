package lista5JavaOO;

public class MetodosInstanciaEEstatico {
    public static void main(String[] args) {

        String strInst1 = new String("Sou uma instância de objeto da classe String");
        String strInst2 = "Viva com paixão!";

        char x = strInst1.charAt(2);
        char y = strInst2.charAt(1);
        char z = strInst2.charAt(0);

        System.out.println("O 3º caracter da strInst1 = "+x);
        System.out.println("O 2º caracter da strInst2 = "+y);
        System.out.println("O 1º caracter da strInst2 = "+z);

        boolean b = strInst1.equalsIgnoreCase(strInst2);
        String strinst3 = b ? "Sim" : "Não";

        System.out.println("As variáveis strInst1 " + " e strInst2 tem o mesmo conjunto de " +
                "caracteres ? "+strinst3 );

        int i = 23;

        String strInst4 = String.valueOf(i);
        System.out.println("Valor de strInst4 = "+strInst4);

        String f = new String("Concertando o erro");
        char f2 = f.charAt(2);
        System.out.println(f2);

    }
}
