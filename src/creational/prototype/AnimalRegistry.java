package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class AnimalRegistry {
    Map<String, Animal> animalMap;

    public AnimalRegistry(){
        animalMap = new HashMap<>();
        this.loadAnimals();
    }

    public Animal createAnimal(String type){
        return (Animal) animalMap.get(type).clone();
    }

    private void loadAnimals(){
        Animal cat = new Cat();
        cat.setAge(10.5f);
        cat.setRace("Cheshire");
        cat.setType("house animal");

        animalMap.put("Cat", cat);

        Animal dog = new Dog();
        dog.setType("house dogo");
        dog.setAge(0.5f);
        dog.setRace("Labrador");

        animalMap.put("Dog", dog);

        Animal cow = new Cow();
        cow.setType("big cow");
        cow.setRace("BIG BIG COW");
        cow.setAge(6.7f);
    }
}
