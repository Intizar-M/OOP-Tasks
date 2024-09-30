//2. Игровой персонаж (GameCharacter):
//
//Поля: name (String), health (int), strength (int).
//Методы:
//attack(GameCharacter other): атакует другого персонажа, уменьшая его здоровье.
//defend(): увеличивает оборону персонажа.
//Дополнительно: Добавьте способности и уровни для персонажа.


public class GameCharacter {
    private String name;
    private int health;
    private int strength;
    private int defence;
    private int level;
    private String ability;

    public GameCharacter(String name, int health, int strength, String ability) {
        setName(name);
        setHealth(health);
        setStrength(strength);
        setDefence(0);
        setLevel(1);
        setAbility(ability);
    }

    public void attack(GameCharacter other) {
        int damage = getStrength() - getDefence();
        if(damage > 0) {
            other.setHealth(other.getHealth() - damage);
            System.out.println(getName() + " атакует " + other.getName() + " на " + damage + " урона, " + other.getName() + " имеет " + other.getHealth() + " здоровья.");
            System.out.println();
        } else {
            System.out.println("Не атакует, так как защита высока.");
        }
    }

    public void defend() {
        setDefence(getDefence() + 5);
        System.out.println("Увеличивает оборону на " + getDefence());
        System.out.println();
    }

    public void levelUp() {
        setLevel(getLevel() + 1);
        setHealth(getHealth() + 10);
        setStrength(getStrength() + 5);

        System.out.println("Увеличивает уровень на " + getLevel());
        System.out.println("Увеличивает здоровье на " + getHealth());
        System.out.println("Увеличивает силу на " + getStrength());
        System.out.println();
    }

    public void useAbility(GameCharacter other) {
        System.out.println(getName() + " использует " + getAbility());
        int abilityDamage = 15;
        other.setHealth(other.getHealth() - abilityDamage);
        System.out.println(other.getName() + " имеет " + other.getHealth() + " здоровья.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }
}