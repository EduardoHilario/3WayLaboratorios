package lista4Logica.ex01;

/**
 * Created by eduardohilario on 10/07/17.
 */
public class Circunferencia {
    private double raio;

    public Circunferencia(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calculaRaio(){
        double res = Math.pow(raio, 2) * Math.PI;
        return res;
    }
}
