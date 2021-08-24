package visitor;

public class PessoaVisitor implements Visitor {

    public String exibir(Pessoa pessoa) {
        return pessoa.aceitar(this);
    }

    @Override
    public String exibirSindico(Sindico sindico) {
        return "Sindico{" +
                "cpf=" + sindico.getCpf() +
                ", nome='" + sindico.getNome() + '\'' +
                ", condominio=" + sindico.getCondominio() +
                '}';
    }

    @Override
    public String exibirMorador(Morador morador) {
        return "Morador{" +
                "cpf=" + morador.getCpf() +
                ", nome='" + morador.getNome() + '\'' +
                ", apartamento='" + morador.getApartamento() + '\'' +
                '}';
    }

    @Override
    public String exibirZelador(Zelador zelador) {
        return "Zelador{" +
                "cpf=" + zelador.getCpf() +
                ", nome='" + zelador.getNome() + '\'' +
                ", salario=" + zelador.getSalario() +
                '}';
    }
    
    
    
}
