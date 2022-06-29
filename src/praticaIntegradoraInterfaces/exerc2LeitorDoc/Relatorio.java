package praticaIntegradoraInterfaces.exerc2LeitorDoc;

public class Relatorio extends Documento{

    String texto;
    int numPag;
    String autor;
    String revisor;

    public Relatorio(String texto, int numPag, String autor, String revisor) {
        this.texto = texto;
        this.numPag = numPag;
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String toString() {
        return "Relatorio: " + "\n" + "texto = " + texto + "\n" +
                "numPag = " + numPag + "\n" +
                "autor = " + autor + '\n' +
                "revisor = " + revisor + "\n";
    }
}
