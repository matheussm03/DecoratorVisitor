package decorator;

public abstract class CarroDecorator implements Carro {

	private Carro carro;
	public String nomePacote;

	public CarroDecorator(Carro carro) {
		this.carro = carro;
	}

	public Carro getCurso() {
		return carro;
	}

	public void setCurso(Carro carro) {
		this.carro = carro;
	}

	public abstract float getPercentualAcrescimoValorTotal();

	public float getValorTotal() {
		return this.carro.getValorTotal() * (1 + (this.getPercentualAcrescimoValorTotal() / 100));
	}

	public abstract String getNomePacoteCarro();

	public String getNomePacote() {
		return this.carro.getNomePacote() + "/" + this.getNomePacoteCarro();
	}

	public void setNomePacote(String nomePacote) {
		this.nomePacote = nomePacote;
	}
}
