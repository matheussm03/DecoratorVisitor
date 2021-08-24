package visitor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorTest {

    @Test
    void deveExibirSindico() {
        Sindico sindico = new Sindico(111, "Maria da Gloria", new Condominio("Cond. FakeNewson"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Sindico{cpf=111, nome='Maria da Gloria', condominio=Cond. FakeNewson}", visitor.exibir(sindico));
    }

    @Test
    void deveExibirMorador() {
        Morador morador = new Morador(222, "Beatriz", "401a");
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Morador{cpf=222, nome='Beatriz', apartamento='401a'}", visitor.exibir(morador));
    }

    @Test
    void deveExibirFuncionario() {
        Zelador zelador = new Zelador(333, "Patricia", 1500.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Zelador{cpf=333, nome='Patricia', salario=1500.0}", visitor.exibir(zelador));
    }
    
    @Test
    void deveExibirOutroSindico() {
        Sindico sindico = new Sindico(444, "Soraya", new Condominio("Cond. Lockdown"));
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Sindico{cpf=444, nome='Soraya', condominio=Cond. Lockdown}", visitor.exibir(sindico));
    }

    @Test
    void deveExibirOutroMorador() {
        Morador morador = new Morador(555, "Marilia", "303f");
        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Morador{cpf=555, nome='Marilia', apartamento='303f'}", visitor.exibir(morador));
    }

    @Test
    void deveExibirOutroFuncionario() {
        Zelador zelador = new Zelador(777, "Katiane", 1300.0f);

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Zelador{cpf=777, nome='Katiane', salario=1300.0}", visitor.exibir(zelador));
    }

}