package visitor;

public class Sindico implements Pessoa {

    private int cpf;
    private String nome;
    private Condominio condominio;

    public Sindico(int cpf, String nome, Condominio condominio) {
        this.cpf = cpf;
        this.nome = nome;
        this.condominio = condominio;
    }

    public int getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCondominio() {
        return this.condominio.getNome();
    }

    public String aceitar(Visitor visitor) {
        return visitor.exibirSindico(this);
    }

}
