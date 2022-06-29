package praticaIntegradoraInterfaces.exerc2LeitorDoc;

import java.util.List;

public class Pessoa {
    String nome;
    int idade;
    List<Habilidade> listaHabilidades;

    public Pessoa(String nome, int idade, List listaHabilidades) {
        this.nome = nome;
        this.idade = idade;
        this.listaHabilidades = listaHabilidades;
    }


    @Override
    public String toString() {
        return  "nome = " + nome + "\n" +
                "idade = " + idade + "\n"+
                "habilidades = " + listaHabilidades + "\n";
    }
}
