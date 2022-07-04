package praticaIntegradoraCorridaNaSelva;

import java.util.ArrayList;
import java.util.List;

public class CircuitoMedio implements Inscricao {
    List<Corredor> listaCorredores;
    static Integer contador = 1;

    public CircuitoMedio() {
        this.listaCorredores = new ArrayList<>();
    }

    @Override
    public void incricao(Corredor corredor) {
        int preco;
        if (corredor.getNumeroDeInscricao() == null) {
            if (corredor.getIdade() <= 18) {
                preco = 2000;
            } else {
                preco = 2300;
            }
            corredor.setValorInscricao(preco);
            corredor.setNumeroDeInscricao(contador);
            contador++;
            this.listaCorredores.add(corredor);
            System.out.println(corredor.getNome() + " " + corredor.getSobrenome() + " está inscrito(a) no circuito médio com o numero de inscrição " + corredor.getNumeroDeInscricao() + ", " + "Valor da inscrição: " + corredor.getValorInscricao() );
        } else {
            System.out.println("A Pessoa já está inscrita em um circuito");
        }
    }

    @Override
    public void desinscrever(Corredor corredor) {

        if (listaCorredores.contains(corredor)) {
            listaCorredores.remove(corredor);
            System.out.println("O corredor " + corredor.getNome() + " com numero de inscrição: " + corredor.getNumeroDeInscricao() + " foi desisncrito do circuiro médio.");
            corredor.setNumeroDeInscricao(null);
            corredor.setValorInscricao(0);
        } else {
            System.out.println("O corredor não está inscrito no circuito médio");
        }
    }
    @Override
    public String toString() {
        return "Lista de Corredores do Circuito Médio = " + listaCorredores + "\n";
    }

}
