package visitor;

public class Zelador implements Pessoa {

    private int cpf;
    private String nome;
    private float salario;

    public Zelador(int cpf, String nome, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirZelador(this);
    }

}
