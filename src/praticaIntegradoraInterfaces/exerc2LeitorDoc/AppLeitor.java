package praticaIntegradoraInterfaces.exerc2LeitorDoc;


import java.util.Arrays;
import java.util.List;

public class AppLeitor {
    public static void main(String[] args) {

        Documento relatorio = new Relatorio("Esse é um texto teste do relatório", 5, "Marina", "Ruanna");
        LerDocumento.lerDoc(relatorio);

        Habilidade programacao = new Habilidade("Programação em java");
        Habilidade ingles = new Habilidade("Ingles básico");
        List<Habilidade> habilidadesPessoa = Arrays.asList(programacao, ingles);
        Pessoa pessoa = new Pessoa("Marina", 30, habilidadesPessoa);
        Documento curriculo = new Curriculo(pessoa);
        LerDocumento.lerDoc(curriculo);
        

        Documento livroPDF = new LivroPDF(50, "Marina", "Aprendendo Java", "Fantasia");
        LerDocumento.lerDoc(livroPDF);
    }
}
