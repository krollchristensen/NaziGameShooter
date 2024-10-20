public class Main {
    public static void main(String[] args) {
        // Vi kan lave en array af fjender (polymorfisme)
        Enemy[] enemies = {new Zombie(), new Robot(), new Alien()};

        // Helten angriber hver fjende, uden at bekymre sig om, hvilken type fjende det er
        for (Enemy enemy : enemies) {
            enemy.attack(); // Kører den rigtige attack() metode afhængig af fjendens type
        }
    }
}
/*
Polymorfisme (Polymorphism): Helten (repræsenteret af main()-metoden)
kan angribe alle typer fjender gennem én fælles Enemy-reference.
Når vi kalder enemy.attack(), vil den korrekte metode (attack()) for den
specifikke fjende blive udført.
 */