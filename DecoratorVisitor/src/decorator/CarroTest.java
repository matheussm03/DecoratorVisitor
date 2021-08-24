package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void deveRetornarValorTotalCarro() {
        Carro carro = new CarroBasico(20000.0f);

        assertEquals(20000.0f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteMultimidia() {
    	Carro carro = new PacoteMultimidia(new CarroBasico(20000.0f));

        assertEquals(22000.0f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteSportivo() {
    	Carro carro = new PacoteSportivo(new CarroBasico(20000.0f));

        assertEquals(24000.0f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteSeguranca() {
    	Carro carro = new PacoteSeguranca(new CarroBasico(20000.0f));

        assertEquals(21000.0f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteMultimidiaSportivo() {
    	Carro carro = new PacoteMultimidia(new PacoteSportivo(new CarroBasico(20000.0f)));

        assertEquals(26400.0f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteMultimidiaSeguranca() {
    	Carro carro = new PacoteMultimidia(new PacoteSeguranca(new CarroBasico(20000.0f)));

        assertEquals(23100.0f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteSportivoSeguranca() {
    	Carro carro = new PacoteSportivo(new PacoteSeguranca(new CarroBasico(20000.0f)));

        assertEquals(25200.002f, carro.getValorTotal());
    }

    @Test
    void deveRetornarValorTotalCarroPacoteMultimidiaSportivoSeguranca() {
    	Carro carro = new PacoteMultimidia(new PacoteSportivo(new PacoteSeguranca(new CarroBasico(20000.0f))));

        assertEquals(27720.002f, carro.getValorTotal());
    }

    @Test
    void deveRetornarNomeCarroBasico() {
    	Carro carro = new CarroBasico();

        assertEquals("Carro", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteMultimidia() {
    	Carro carro = new PacoteMultimidia(new CarroBasico());

        assertEquals("Carro/PacoteMultimidia", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteSportivo() {
    	Carro carro = new PacoteSportivo(new CarroBasico());

        assertEquals("Carro/PacoteSportivo", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteSeguranca() {
    	Carro carro = new PacoteSeguranca(new CarroBasico());

        assertEquals("Carro/PacoteSeguranca", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteSportivoPacoteMultimidia() {
    	Carro carro = new PacoteMultimidia(new PacoteSportivo (new CarroBasico()));

        assertEquals("Carro/PacoteSportivo/PacoteMultimidia", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteSegurancaPacoteMultimidia() {
    	Carro carro = new PacoteMultimidia(new PacoteSeguranca (new CarroBasico()));

        assertEquals("Carro/PacoteSeguranca/PacoteMultimidia", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteSegurancaPacoteSportivo() {
    	Carro carro = new PacoteSportivo(new PacoteSeguranca (new CarroBasico()));

        assertEquals("Carro/PacoteSeguranca/PacoteSportivo", carro.getNomePacote());
    }

    @Test
    void deveRetornarNomeCarroPacoteSegurancaPacoteSportivoPacoteMultimidia() {
    	Carro carro = new PacoteMultimidia (new PacoteSportivo(new PacoteSeguranca (new CarroBasico())));

        assertEquals("Carro/PacoteSeguranca/PacoteSportivo/PacoteMultimidia", carro.getNomePacote());
    }

}