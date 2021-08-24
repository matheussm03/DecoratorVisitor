package visitor;

public class Morador implements Pessoa {

    private int cpf;
    private String nome;
    private String apartamento;

    public Morador(int cpf, String nome, String apartamento) {
        this.cpf = cpf;
        this.nome = nome;
        this.apartamento = apartamento;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getApartamento() {
        return apartamento;
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirMorador(this);
    }

}
