package decorator;

public class CarroBasico implements Carro {

    public float valorTotal;

    public CarroBasico() {
    }

    public CarroBasico(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public String getNomePacote() {
        return "Carro";
    }

}
