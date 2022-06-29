package praticaIntegradoraInterfaces.exerc2LeitorDoc;

public class Curriculo extends Documento {
    Pessoa pessoa;

    public Curriculo(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Curriculo: " + "\n" + pessoa.toString();
    }
}
