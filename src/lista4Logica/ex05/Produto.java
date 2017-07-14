package lista4Logica.ex05;

/**
 * Created by eduardohilario on 11/07/17.
 */
public class Produto {
    private Integer codigo;
    private String nome;
    private double valor;

    public Produto(Integer codigo, String nome, double valor) {
        this.codigo = codigo;
        this.nome = nome;
        this.valor = valor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
