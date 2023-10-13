import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EscopetaTest {

    @Test
    void deveRetornarDanoEscopetaComEmpunhadura() {
        Acessorio acessorio = new Empunhadura();
        Escopeta escopeta = new Escopeta(3000.0f);
        escopeta.setAcessorio(acessorio);
        assertEquals(3300.0f, escopeta.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoEscopetaComLaser() {
        Acessorio acessorio = new Laser();
        Escopeta escopeta = new Escopeta(3000.0f);
        escopeta.setAcessorio(acessorio);
        assertEquals(3300.0f, escopeta.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoEscopetaComProjetilFlamejante() {
        Acessorio acessorio = new ProjetilFlamejante();
        Escopeta escopeta = new Escopeta(3000.0f);
        escopeta.setAcessorio(acessorio);
        assertEquals(7500.0f, escopeta.calcularDano(), 0.01f);
    }

    @Test
    void deveRetornarDanoEscopetaComSilenciador() {
        Acessorio acessorio = new Silenciador();
        Escopeta escopeta = new Escopeta(3000.0f);
        escopeta.setAcessorio(acessorio);
        assertEquals(3600.0f, escopeta.calcularDano(), 0.01f);
    }

}