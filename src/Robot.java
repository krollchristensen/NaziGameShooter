// Robot-klassen arver fra Enemy
class Robot extends Enemy {
    // Robot har sit eget angreb
    @Override
    public void attack() {

        System.out.println("Robot shoots laser!");
    }
}