package praticaIntegradoraCorridaNaSelva;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa(35087232, "Marina", "Ruanna", 30, 93331865,"O-sgrg");
        Pessoa pessoa1 = new Pessoa(35087232, "Ruanna", "Marina", 30, 93331865,"O-sgrg");
        Pessoa pessoa3 = new Pessoa(35087232, "Jose", "Silva", 30, 93331865,"O-sgrg");

        HashMap<Integer, Corredor> listadecorredoresCP = new HashMap<>();
        HashMap<Integer, Corredor> listadecorredoresCM = new HashMap<>();

        CircuitoPequeno circuitoPequeno = new CircuitoPequeno(listadecorredoresCP);
        circuitoPequeno.incricao(pessoa);
        circuitoPequeno.incricao(pessoa1);


        System.out.println(circuitoPequeno);

        CircuitoMedio circuitoMedio = new CircuitoMedio(listadecorredoresCM);
        circuitoMedio.incricao(pessoa3);





    }
}
