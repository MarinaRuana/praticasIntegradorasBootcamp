package praticaIntegradoraCorridaNaSelva;

public class Corredor {

    private Integer rg;
    private String nome, sobrenome;
    private Integer idade;
    private Integer numeroDeEmergencia;
    private String tipoSanguineo;
    private Integer valorInscricao;
    private Integer numeroDeInscricao;


    public Corredor(Integer rg, String nome, String sobrenome, Integer idade, Integer numeroDeEmergencia, String tipoSanguineo) {
        this.rg = rg;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numeroDeEmergencia = numeroDeEmergencia;
        this.tipoSanguineo = tipoSanguineo;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getNumeroDeEmergencia() {
        return numeroDeEmergencia;
    }

    public void setNumeroDeEmergencia(Integer numeroDeEmergencia) {
        this.numeroDeEmergencia = numeroDeEmergencia;
    }

    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public Integer getValorInscricao() {
        return valorInscricao;
    }

    public void setValorInscricao(Integer valorInscricao) {
        this.valorInscricao = valorInscricao;
    }

    public Integer getNumeroDeInscricao() {
        return numeroDeInscricao;
    }

    public void setNumeroDeInscricao(Integer numeroDeInscricao) {
        this.numeroDeInscricao = numeroDeInscricao;
    }

    @Override
    public String toString() {
        return "{ Corredor: " +  this.nome + " " + this.sobrenome + ", " +
                "registro: " + this.numeroDeInscricao + " }";
    }
}
