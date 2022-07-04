package praticaIntegradoraCorridaNaSelva;

import java.util.ArrayList;
import java.util.List;

public class CircuitoLongo implements Inscricao{
    List<Corredor> listaCorredores;
    static Integer contador = 1;

    public CircuitoLongo() {
        this.listaCorredores = new ArrayList<>();
    }

    @Override
    public void incricao(Corredor corredor) {
        int preco;
        if (corredor.getIdade() >= 18) {
            if (corredor.getNumeroDeInscricao() == null) {
                preco = 2800;
                corredor.setValorInscricao(preco);
                corredor.setNumeroDeInscricao(contador);
                contador++;
                this.listaCorredores.add(corredor);
                System.out.println(corredor.getNome() + " " + corredor.getSobrenome() + " está inscrito(a) no circuito pequeno com o numero de inscrição " + corredor.getNumeroDeInscricao() + ", " + "valor da inscrição: " + corredor.getValorInscricao() + "\n");
            } else {
                System.out.println("A Pessoa já está inscrita em um circuito");
            }
        } else {
            System.out.println("Precisa ser maior de 18 anos para se inscrever no circuito longo!");
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
