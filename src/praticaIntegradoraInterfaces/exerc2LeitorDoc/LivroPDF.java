package praticaIntegradoraInterfaces.exerc2LeitorDoc;

public class LivroPDF extends Documento {
    int numPag;
    String autor;
    String titulo;
    String genero;

    public LivroPDF(int numPag, String autor, String titulo, String genero) {
        this.numPag = numPag;
        this.autor = autor;
        this.titulo = titulo;
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "LivroPDF :" + "\n" +
                "numPag = " + numPag + "\n" +
                "autor = " + autor + "\n" +
                "titulo = " + titulo + "\n" +
                "genero = " + genero + "\n";
    }
}
