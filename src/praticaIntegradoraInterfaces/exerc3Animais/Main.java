package praticaIntegradoraInterfaces.exerc3Animais;

public class Main {
    public static void main(String[] args) {
        Animal vaca = new Vaca();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        vaca.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();

        ComerAnimal.comerAnimal(vaca);
        ComerAnimal.comerAnimal(gato);
        ComerAnimal.comerAnimal(cachorro);
    }
}
