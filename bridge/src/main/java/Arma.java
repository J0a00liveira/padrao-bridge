public abstract class Arma {

    protected Acessorio acessorio;

    protected float danoBase;

    public Arma(float danoBase) {
        this.danoBase = danoBase;
    }

    public void setAcessorio(Acessorio acessorio) {
        this.acessorio = acessorio;
    }

    public void setDanoBase(float danoBase) {
        this.danoBase = danoBase;
    }

    public abstract float calcularDano();
}
