public class Pistola extends Arma {

    public Pistola(float danoBase) {
        super(danoBase);
    }

    public float calcularDano() {
        return this.danoBase;
    }
}
