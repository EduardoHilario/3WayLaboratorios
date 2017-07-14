package calculadoraV2;


public class CalculadoraSalario {

    public double calculaReajuste(Pessoa funcionario) {

        for (int i = 0; i < funcionario.getCargo().getSalario().length; i++) {

            if(funcionario.getSalario() < funcionario.getCargo().getSalario()[i]){

                return funcionario.getSalario()*funcionario.getCargo().getFaixaReajuste()[i]/100;

            }

        }
        return funcionario.getSalario()*(funcionario.getCargo().getFaixaReajuste()
                [funcionario.getCargo().getFaixaReajuste().length-1])/100;


    }
}

