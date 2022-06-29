package praticaIntegradoraInterfaces.exerc3Animais;

public interface ComerAnimal {

    static void comerAnimal(Animal animal){
        animal.comer();
    }
}
