package lista4Logica.ex04;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class CalculadoraReserva {
    private int limite;
    private double valorDiaria;
    private double taxaMuitasDiarias;
    private double taxaNormalDiarias;
    private double taxaPoucasDiarias;

    public CalculadoraReserva(int limite, double valorDiaria, double taxaMuitasDiarias, double taxaNormalDiarias, double taxaPoucasDiarias) {
        this.limite = limite;
        this.valorDiaria = valorDiaria;
        this.taxaMuitasDiarias = taxaMuitasDiarias;
        this.taxaNormalDiarias = taxaNormalDiarias;
        this.taxaPoucasDiarias = taxaPoucasDiarias;
    }

    public double calculeValorTotal(Reserva reserva){
        return reserva.getQuantidadeDiarias() * valorDiaria + calculeTaxaServico(reserva);
    }

    public double calculeTaxaServico(Reserva reserva){
        if(reserva.getQuantidadeDiarias() > limite){
            return getTaxaMuitasDiarias() * reserva.getQuantidadeDiarias();
        }
        else if (reserva.getQuantidadeDiarias() < limite){
            return getTaxaPoucasDiarias() * reserva.getQuantidadeDiarias();
        }
        else{
            return getTaxaNormalDiarias() * reserva.getQuantidadeDiarias();
        }
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public double getTaxaMuitasDiarias() {
        return taxaMuitasDiarias;
    }

    public void setTaxaMuitasDiarias(double taxaMuitasDiarias) {
        this.taxaMuitasDiarias = taxaMuitasDiarias;
    }

    public double getTaxaNormalDiarias() {
        return taxaNormalDiarias;
    }

    public void setTaxaNormalDiarias(double taxaNormalDiarias) {
        this.taxaNormalDiarias = taxaNormalDiarias;
    }

    public double getTaxaPoucasDiarias() {
        return taxaPoucasDiarias;
    }

    public void setTaxaPoucasDiarias(double taxaPoucasDiarias) {
        this.taxaPoucasDiarias = taxaPoucasDiarias;
    }
}
