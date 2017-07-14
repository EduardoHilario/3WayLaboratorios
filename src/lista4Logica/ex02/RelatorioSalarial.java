package lista4Logica.ex02;

/**
 * Created by eduardohilario on 10/07/17.
 */
public class RelatorioSalarial {
    private double salarioBruto;
    private double salarioLiquido;
    private double valorHoraTrabalhada;
    private int quantidadeHorasTrabalhadas;
    private double percentualDesconto;
    private double desconto;



    public void calculeSalarioBruto(){
        setSalarioBruto(getQuantidadeHorasTrabalhadas()*getValorHoraTrabalhada());
    }

    public void calculeDesconto(){
        setDesconto((getPercentualDesconto()/100.0)*getSalarioBruto());
    }
    public void calculeSalarioLiquido(){
        setSalarioLiquido(getSalarioBruto()-getDesconto());
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double getSalarioLiquido() {
        return salarioLiquido;
    }

    public void setSalarioLiquido(double salarioLiquido) {
        this.salarioLiquido = salarioLiquido;
    }

    public double getValorHoraTrabalhada() {
        return valorHoraTrabalhada;
    }

    public void setValorHoraTrabalhada(double valorHoraTrabalhada) {
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public int getQuantidadeHorasTrabalhadas() {
        return quantidadeHorasTrabalhadas;
    }

    public void setQuantidadeHorasTrabalhadas(int quantidadeHorasTrabalhadas) {
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
    }

    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }
}
