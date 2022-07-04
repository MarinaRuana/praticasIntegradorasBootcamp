package praticaIntegradoraCorridaNaSelva;



public class Main {
    public static void main(String[] args) {

        Corredor corredor = new Corredor(35087232, "Marina", "Ruanna", 30, 93331865,"O-sgrg");
        Corredor corredor1 = new Corredor(35087232, "Ruanna", "Marina", 30, 93331865,"O-sgrg");
        Corredor corredor3 = new Corredor(35087232, "Jose", "Silva", 30, 93331865,"O-sgrg");


        CircuitoPequeno circuitoPequeno = new CircuitoPequeno();
        circuitoPequeno.incricao(corredor);
        circuitoPequeno.incricao(corredor1);


        System.out.println(circuitoPequeno);

        CircuitoMedio circuitoMedio = new CircuitoMedio();
        circuitoMedio.incricao(corredor3);

        System.out.println(circuitoMedio);

        circuitoPequeno.desinscrever(corredor1);

        System.out.println(circuitoPequeno);

        circuitoMedio.incricao(corredor1);
        System.out.println(circuitoMedio);




    }
}
