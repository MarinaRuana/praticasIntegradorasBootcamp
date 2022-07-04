package praticaIntegradoraCorridaNaSelva;


import java.util.HashMap;

public class CircuitoPequeno implements Inscricao {

    HashMap<Integer, Corredor> listaCorredores;
    static Integer contador = 0;

    public CircuitoPequeno(HashMap<Integer, Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }

    @Override
    public void incricao(Pessoa pessoa) {
        int preco;
        if (!pessoa.inscrito) {
            if (pessoa.idade <= 18) {
                preco = 1300;
            } else {
                preco = 1500;
            }
            Corredor corredor = new Corredor(pessoa, preco);
            pessoa.inscrito = true;
            contador++;
            this.listaCorredores.put(contador, corredor);
        } else {
            System.out.println("A Pessoa já está inscrita em um circuito");
        }
    }


    @Override
    public String toString() {
        return "CircuitoPequeno: " + "\n" +
                "Lista de Corredores do Circuito Pequeno = " + listaCorredores + "\n";
    }
}
