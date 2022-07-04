package praticaIntegradoraCorridaNaSelva;

public class Pessoa {

    Integer rg;
    String nome, sobrenome;
    Integer idade;
    Integer numeroDeEmergencia;
    String tipoSanguineo;
    boolean inscrito;

    public Pessoa() {
    }

    public Pessoa(Integer rg, String nome, String sobrenome, Integer idade, Integer numeroDeEmergencia, String tipoSanguineo) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroDeEmergencia = numeroDeEmergencia;
        this.tipoSanguineo = tipoSanguineo;
    }

    @Override
    public String toString() {
        return nome + " " + sobrenome;
    }
}
