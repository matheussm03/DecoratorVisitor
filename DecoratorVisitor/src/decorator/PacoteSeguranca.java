package decorator;

public class PacoteSeguranca extends CarroDecorator {

    public PacoteSeguranca(Carro carro) {
        super(carro);
    }

    public float getPercentualAcrescimoValorTotal() {
        return 5.0f;
    }

    public String getNomePacoteCarro() {
        return "PacoteSeguranca";
    }
}
