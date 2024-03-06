import java.util.ArrayList;

import Animals.Cat;
import Animals.Dog;
import Animals.Elephant;
import Animals.Mammal;
import Animals.Whale;

public class Main {
    public static void main(String[] args) {
        Dog perro1 = new Dog("Labrador", 5, "wooow", 5);
        Dog perro2 = new Dog("Chiuaua", 7, "buup buuuup", 3);
        Cat gato1 = new Cat("Común Europeo", 3, "Meoooow", 5);
        Elephant elefante1 = new Elephant("African", 6, "like trumpet", 1, 3000);
        Whale ballena1 = new Whale("Orca", 20, "whistling", 1, 8000);
        Whale ballena2 = new Whale("Moby Dick", 20, "whistling", 1, 50000);
        
        // Pruebas
        System.out.println(perro1.makeSound());
        System.out.println("giveBirth: " + perro1.giveBirth());
        System.out.println("giveBirth: " + ballena1.giveBirth());

        ArrayList<Mammal> mamiferos = new ArrayList<>();

        mamiferos.add(perro2);
        mamiferos.add(perro1);
        mamiferos.add(gato1);
        mamiferos.add(elefante1);
        mamiferos.add(ballena1);
        mamiferos.add(ballena2);

        for (int i = 0; i < mamiferos.size(); i++) {
            System.out.println(mamiferos.get(i).toString());
        }

        System.out.println("Total de animales instanciados: " + perro2.getTotalMammals());
    }
}
