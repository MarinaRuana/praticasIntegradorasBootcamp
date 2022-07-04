package praticaIntegradoraStreams;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class Garagem {

    int id;
    List<Veiculos> listaVeiculos;

    public Garagem(int id, List<Veiculos> listaVeiculos) {
        this.id = id;
        this.listaVeiculos = listaVeiculos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Veiculos> getListaVeiculos() {
        return listaVeiculos;
    }

    @Override
    public String toString() {
        return "Garagem id : " + id + "\n" +
                "listaVeiculos = " + listaVeiculos
                ;
    }

    public void setListaVeiculos(List<Veiculos> listaVeiculos) {
        this.listaVeiculos = listaVeiculos;
    }

    public void listaPrecoDecrescente() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculos::getPreco))
                .forEach(System.out::println);

    }

    public void listaPrecoCrescente() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculos::getPreco))
                .forEach(System.out::println);

    }

    public void listarPorMarcas() {
        listaVeiculos.stream()
                .sorted(Comparator.comparing(Veiculos::getMarca))
                .forEach(System.out::println);

    }

    public void filtrarPrecos(Double valor) {
        listaVeiculos.stream()
                .filter(Veiculos -> Veiculos.getPreco() < valor)
                .forEach(System.out::println);
    }

    public void precosDecrescente() {
        listaVeiculos.stream().
                map(Veiculos::getPreco).sorted((v1, v2) -> Double.compare(v2, v1))
                .forEach(System.out::println);
    }

    public void precosCrescente() {
        listaVeiculos.stream()
                .map(Veiculos::getPreco)
                .sorted(Double::compare)
                .forEach(System.out::println);
    }

    public void carrosOrdemAlfabetica() {
        listaVeiculos.stream()
                .map((k) -> k.getModelo().concat(" " + k.getMarca()))
                .sorted(String::compareTo)
                .forEach(System.out::println);

    }

    public void mediaPrecos() {

        listaVeiculos.stream()
                .mapToDouble(Veiculos::getPreco)
                .average()
                .stream()
                .forEach(System.out::println);
    }

    public void ordempreco() {
        listaVeiculos.stream()
                .sorted(Veiculos::compareTo)
                .forEach(System.out::println);
    }


}
