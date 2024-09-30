//5. Зоопарк (Animal и Zoo):
//
//Animal:
//Поля: species (String), name (String), age (int).
//Zoo:
//Поля: animals (List<Animal>).
//Методы:
//addAnimal(Animal animal): добавляет животное в зоопарк.
//displayAnimals(): отображает информацию о всех животных.
//Дополнительно: Реализуйте функцию поиска животных по виду.

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " added to the zoo.");
    }

    public void display() {
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(List<Animal> animals) {
        this.animals = animals;
    }
}

