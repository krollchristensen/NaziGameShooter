// Alien-klassen arver fra Enemy
class Alien extends Enemy {
    // Alien har sit eget angreb
    @Override
    public void attack() {

        System.out.println("Alien uses mind control!");
    }
}