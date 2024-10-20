// Zombie-klassen arver fra Enemy
class Zombie extends Enemy {
    // Zombie har sit eget angreb
    @Override
    public void attack() {

        System.out.println("Zombie bites!");
    }
}