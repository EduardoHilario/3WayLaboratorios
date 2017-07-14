package calculadora;



/**
 * Created by eduardohilario on 13/07/17.
 */
public enum Cargo {
    DESENVOLVEDOR(3000,5,8),DESIGNER(2800,6,8),VENDEDOR(1200,15,12),GERENTE(3150,6,9);

    private double salario;
    private double faixa1;
    private double faixa2;



    Cargo(double salario, double faixa1, double faixa2) {
        this.salario = salario;
        this.faixa1 = faixa1;
        this.faixa2 = faixa2;
    }

    public double getSalario() {
        return salario;
    }

    public double getFaixa1() {
        return faixa1;
    }

    public double getFaixa2() {
        return faixa2;
    }
}
