import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PistolaTest {

    @Test
    void deveRetornarDanoDaPistolaComEmpunhadura() {
        Acessorio acessorio = new Empunhadura();
        Pistola pistola = new Pistola(1000.0f);
        pistola.setAcessorio(acessorio);
        assertEquals(1000.0f, pistola.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoDaPistolaComLaser() {
        Acessorio acessorio = new Laser();
        Pistola pistola = new Pistola(1000.0f);
        pistola.setAcessorio(acessorio);
        assertEquals(1000.0f, pistola.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoDaPistolaComProjetilFlamejante() {
        Acessorio acessorio = new ProjetilFlamejante();
        Pistola pistola = new Pistola(1000.0f);
        pistola.setAcessorio(acessorio);
        assertEquals(1000.0f, pistola.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoDaPistolaComSilenciador() {
        Acessorio acessorio = new Silenciador();
        Pistola pistola = new Pistola(1000.0f);
        pistola.setAcessorio(acessorio);
        assertEquals(1000.0f, pistola.calcularDano(), 0.01f);
    }

}