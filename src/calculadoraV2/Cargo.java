package calculadoraV2;


import java.util.List;

/**
 * Created by eduardohilario on 13/07/17.
 */
public enum Cargo {
    DESENVOLVEDOR(), DESIGNER(), VENDEDOR(), GERENTE();

    private double[] salario;
    private double[] faixaReajuste;

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        this.salario = salario;
    }

    public double[] getFaixaReajuste() {
        return faixaReajuste;
    }

    public void setFaixaReajuste(double[] faixaReajuste) {
        this.faixaReajuste = faixaReajuste;
    }
}
