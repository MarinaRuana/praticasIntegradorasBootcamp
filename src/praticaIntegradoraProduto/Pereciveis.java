package praticaIntegradoraProduto;

import praticaIntegradoraProduto.Produto;

public class Pereciveis extends Produto {

    int diasParaVencer;

    public Pereciveis(String nome, double preco, int diasParaVencer) {
        super(nome, preco);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }

    public void setDiasParaVencer(int diasParaVencer) {
        this.diasParaVencer = diasParaVencer;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", diasParaVencer = " + diasParaVencer;
    }

    @Override
    public double calcular(int quantidadeDeProdutos) {
        if (diasParaVencer == 1){
            return quantidadeDeProdutos * (getPreco() / 4);
        } else if (diasParaVencer == 2){
            return quantidadeDeProdutos * (getPreco() / 3);
        } else if (diasParaVencer == 3) {
            return quantidadeDeProdutos * (getPreco() / 2);
        } else {
            return quantidadeDeProdutos * getPreco();
        }
    }
}
