import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetralhadoraTest {

    @Test
    void deveRetornarDanoDaMetralhadoraComEmpunhadura() {
        Acessorio acessorio = new Empunhadura();
        Metralhadora metralhadora = new Metralhadora(50.0f);
        metralhadora.setAcessorio(acessorio);
        metralhadora.setBalasPorRajada(2);
        assertEquals(110.0f, metralhadora.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoDaMetralhadoraComLaser() {
        Acessorio acessorio = new Laser();
        Metralhadora metralhadora = new Metralhadora(50.0f);
        metralhadora.setAcessorio(acessorio);
        metralhadora.setBalasPorRajada(2);
        assertEquals(110.0f, metralhadora.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoDaMetralhadoraComProjetilFlamejante() {
        Acessorio acessorio = new ProjetilFlamejante();
        Metralhadora metralhadora = new Metralhadora(50.0f);
        metralhadora.setAcessorio(acessorio);
        metralhadora.setBalasPorRajada(2);
        assertEquals(250.0f, metralhadora.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoDaMetralhadoraComSilenciador() {
        Acessorio acessorio = new Silenciador();
        Metralhadora metralhadora = new Metralhadora(50.0f);
        metralhadora.setAcessorio(acessorio);
        metralhadora.setBalasPorRajada(2);
        assertEquals(120.0f, metralhadora.calcularDano(), 0.01f);
    }

}