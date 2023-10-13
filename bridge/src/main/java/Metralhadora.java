public class Metralhadora extends Arma {

    private int balasPorRajada;

    public Metralhadora(float danoBase) {
        super(danoBase);
    }

    public void setBalasPorRajada(int balasPorRajada) {
        this.balasPorRajada = balasPorRajada;
    }

    public float calcularDano() {
        return this.danoBase * this.balasPorRajada * (1 + this.acessorio.percentualAumentoDano());
    }
}
