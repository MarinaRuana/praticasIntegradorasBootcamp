package praticaIntegradoraInterfaces.exerc2LeitorDoc;

public class Habilidade {

    String habilidade;

    public Habilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public String toString() {
        return habilidade;
    }
}
