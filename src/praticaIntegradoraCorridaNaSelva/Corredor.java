package praticaIntegradoraCorridaNaSelva;

public class Corredor {

    Pessoa pessoa;
    Integer valorInscricao;


    public Corredor(Pessoa pessoa, Integer valorInscricao) {
        this.pessoa = pessoa;
        this.valorInscricao = valorInscricao;
    }

    @Override
    public String toString() {
        return "Corredor: " + pessoa + " ";
    }
}
