package praticaIntegradoraCorridaNaSelva;

import java.util.HashMap;

public class CircuitoMedio extends Circuito implements Inscricao {
    HashMap<Integer, Corredor> listaCorredores;
    static Integer contador = 1;

    public CircuitoMedio(HashMap<Integer, Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
    }


    @Override
    public String toString() {
        return "CircuitoPequeno: " + "\n" +
                "Lista de Corredores do Circuito Pequeno = " + listaCorredores + "\n";
    }

    @Override
    public void incricao(Pessoa pessoa) {
        int preco;
        if (!pessoa.inscrito) {
            if (pessoa.idade <= 18) {
                preco = 2000;
            } else {
                preco = 2300;
            }
            Corredor corredor = new Corredor(pessoa,preco);
            pessoa.inscrito = true;
            this.listaCorredores.put(contador, corredor);
            contador++;
        } else {
            System.out.println("A Pessoa já está inscrita em um circuito");
        }
    }

}
