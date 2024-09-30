//2. Игровой персонаж (GameCharacter):
//
//Поля: name (String), health (int), strength (int).
//Методы:
//attack(GameCharacter other): атакует другого персонажа, уменьшая его здоровье.
//defend(): увеличивает оборону персонажа.
//        Дополнительно: Добавьте способности и уровни для персонажа.


public class Main {
    public static void main(String[] args) {
        GameCharacter hero = new GameCharacter("Гарри Поттер", 20, 20, "fireball");
        GameCharacter enemy = new GameCharacter("Волан-де-морд", 20, 50, "fireball");

        hero.attack(enemy);
        hero.defend();
        enemy.defend();
        enemy.attack(hero);
        hero.levelUp();
        enemy.levelUp();
        hero.useAbility(enemy);
    }
}