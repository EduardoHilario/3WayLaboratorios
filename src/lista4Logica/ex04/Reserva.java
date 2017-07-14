package lista4Logica.ex04;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class Reserva {
    private Cliente cliente;
    private int quantidadeDiarias;

    public Reserva(Cliente cliente, int quantidadeDiarias) {
        this.cliente = cliente;
        this.quantidadeDiarias = quantidadeDiarias;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQuantidadeDiarias() {
        return quantidadeDiarias;
    }

    public void setQuantidadeDiarias(int quantidadeDiarias) {
        this.quantidadeDiarias = quantidadeDiarias;
    }
}
