package calculadora;


public class CalculadoraSalario {

    public double calculaReajuste(Pessoa funcionario){

                if(funcionario.getSalario() <= funcionario.getCargo().getSalario()){
                    return funcionario.getSalario() * funcionario.getCargo().getFaixa1()/100;
                }else{
                    return funcionario.getSalario() * funcionario.getCargo().getFaixa2()/100;
                }

    }

    public double calculaSalario(Pessoa funcionario){
        return funcionario.getSalario() + calculaReajuste(funcionario);
    }

}
