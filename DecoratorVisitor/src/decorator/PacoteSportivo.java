package decorator;

public class PacoteSportivo extends CarroDecorator {

    public PacoteSportivo(Carro carro) {
        super(carro);
    }

    public float getPercentualAcrescimoValorTotal() {
        return 20.0f;
    }

    public String getNomePacoteCarro() {
        return "PacoteSportivo";
    }


}
