package praticaIntegradoraInterfaces.exerc3Animais;

public class Vaca extends Animal{

    @Override
    public void emitirSom() {
        System.out.println("Muu!");
    }

    @Override
    public void comer() {
        System.out.println("Comendo pasto");
    }
}
