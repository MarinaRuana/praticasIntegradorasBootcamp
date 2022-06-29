package praticaIntegradoraInterfaces.exerc2LeitorDoc;

public class Pessoa {
    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String programar(){
        return  "Sabe Programar em Java";
    }

    public String falaIngles(){
        return "Inglês Avançado";
    }

    @Override
    public String toString() {
        return "Pessoa: " + "\n" + "nome = " + nome + "\n" +
                "idade = " + idade + "\n"+
                "habilidades = " + falaIngles() + ", " + programar() + "\n";
    }
}
