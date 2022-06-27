package praticaIntegradoraProduto;


public class Distribuidora {
    public static void main(String[] args) {

        Produto arroz = new Pereciveis("Arroz", 2.50, 1);
        Produto feijao = new Pereciveis("Feijao", 1.50, 2);
        Produto carne = new Pereciveis("Carne", 4.50, 2);
        Produto macarrao = new Pereciveis("Macarrao", 5.50, 5);
        Produto lapis = new NaoPereciveis("Lapis", 0.50, "Papelaria");
        Produto borracha = new NaoPereciveis("Borracha", 0.80, "Papelaria");


        Produto []carrinho = new Produto[6];
        carrinho[0] = arroz;
        carrinho[1] = feijao;
        carrinho[2] = carne;
        carrinho[3] = macarrao;
        carrinho[4] = lapis;
        carrinho[5] = borracha;

        for (Produto produto : carrinho) {
            double total = produto.calcular(5);
            System.out.println(total);
        }
    }
}
