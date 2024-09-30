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

public class Animal {
    private String species;
    private String name;
    private int age;

    public Animal(String species, String name, int age) {
        setSpecies(species);
        setName(name);
        setAge(age);
    }

    public String toString(){
        return species + " named " + name + " is " + age + " years old.";
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
