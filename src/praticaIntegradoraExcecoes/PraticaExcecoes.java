package praticaIntegradoraExcecoes;

public class PraticaExcecoes {

    int a;
    int b;

    public PraticaExcecoes(){
    }

    public void calculaRazao(){
        try{
           int razao =  b / a;
            System.out.println(razao);
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Nao é possivel dividir por zero");
        } finally {
            System.out.println("Programa encerrado");
        }

    }
}
