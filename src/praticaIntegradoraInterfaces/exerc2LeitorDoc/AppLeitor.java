package praticaIntegradoraInterfaces.exerc2LeitorDoc;

public class AppLeitor {
    public static void main(String[] args) {

        Documento relatorio = new Relatorio("Esse é um texto teste do relatório", 5, "Marina", "Ruanna");
        LerDocumento.lerDoc(relatorio);

        Pessoa pessoa = new Pessoa("Marina", 30);
        Documento curriculo = new Curriculo(pessoa);
        LerDocumento.lerDoc(curriculo);

        Documento livroPDF = new LivroPDF(50, "Marina", "Aprendendo Java", "Fantasia");
        LerDocumento.lerDoc(livroPDF);
    }
}
