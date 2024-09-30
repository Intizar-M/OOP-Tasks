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


public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Cat", "Tom", 2);
        Animal animal2 = new Animal("Dog", "Jerry", 3);
        Animal animal3 = new Animal("Capibara", "Sonya", 17);

        Zoo zoo = new Zoo();

        zoo.addAnimal(animal1);
        zoo.addAnimal(animal2);
        zoo.addAnimal(animal3);

        zoo.display();
    }
}