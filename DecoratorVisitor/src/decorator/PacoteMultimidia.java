package decorator;

public class PacoteMultimidia extends CarroDecorator {

    public PacoteMultimidia(Carro carro) {
        super(carro);
    }

    public float getPercentualAcrescimoValorTotal() {
        return 10.0f;
    }

    public String getNomePacoteCarro() {
        return "PacoteMultimidia";
    }
}
