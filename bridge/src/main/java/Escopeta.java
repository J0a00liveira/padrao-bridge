public class Escopeta extends Arma {

    public Escopeta(float danoBase) {
        super(danoBase);
    }

    public float calcularDano() {
        return this.danoBase * (1 + this.acessorio.percentualAumentoDano());
    }

}
