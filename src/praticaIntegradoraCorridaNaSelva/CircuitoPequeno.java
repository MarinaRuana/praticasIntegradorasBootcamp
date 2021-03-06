package praticaIntegradoraCorridaNaSelva;

import java.util.ArrayList;
import java.util.List;

public class CircuitoPequeno implements Inscricao {

    List<Corredor> listaCorredores;
    static Integer contador = 1;

    public CircuitoPequeno() {
        this.listaCorredores = new ArrayList<>();
    }

    @Override
    public void incricao(Corredor corredor) {
        int preco;
        if (corredor.getNumeroDeInscricao() == null) {
            if (corredor.getIdade() <= 18) {
                preco = 1300;
            } else {
                preco = 1500;
            }
            corredor.setValorInscricao(preco);
            corredor.setNumeroDeInscricao(contador);
            contador++;
            this.listaCorredores.add(corredor);
            System.out.println(corredor.getNome() + " " + corredor.getSobrenome() + " está inscrito(a) no circuito pequeno com o numero de inscrição " + corredor.getNumeroDeInscricao() + ", " + "valor da inscrição: " + corredor.getValorInscricao() + "\n");
        } else {
            System.out.println("A Pessoa já está inscrita em um circuito");
        }
    }

    @Override
    public void desinscrever(Corredor corredor) {

        if (listaCorredores.contains(corredor)) {
            listaCorredores.remove(corredor);
            System.out.println("O corredor " + corredor.getNome() + " com numero de inscrição: " + corredor.getNumeroDeInscricao() + " foi desisncrito do circuiro pequeno." + "\n");
            corredor.setNumeroDeInscricao(null);
            corredor.setValorInscricao(0);
        } else {
            System.out.println("O corredor não está inscrito neste circuito");
        }
    }


    @Override
    public String toString() {
        return "Lista de Corredores do Circuito Pequeno = " + listaCorredores + "\n";
    }
}
