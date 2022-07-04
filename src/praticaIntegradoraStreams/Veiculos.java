package praticaIntegradoraStreams;


import java.util.Objects;

public class Veiculos implements Comparable<Veiculos> {

    private String modelo;
    private String marca;
    private double preco;

    public Veiculos(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "Modelo = " + modelo + "\n" +
                "Marca = " + marca + "\n" +
                "Preco = " + preco + "\n";
    }

    @Override
    public int compareTo(Veiculos v) {
            if(this.preco < v.getPreco())
                return -1;
            else if(v.getPreco() < this.preco)
                return 1;
            return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Veiculos)) return false;
        Veiculos veiculos = (Veiculos) o;
        return Double.compare(veiculos.getPreco(), getPreco()) == 0 && Objects.equals(getModelo(), veiculos.getModelo()) && Objects.equals(getMarca(), veiculos.getMarca());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelo(), getMarca(), getPreco());
    }
}
