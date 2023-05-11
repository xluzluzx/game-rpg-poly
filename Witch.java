public class Witch extends Enemy {
    public Witch(int x, int y) {
        super(x, y);
    }

    public void move() {
        System.out.println("Witch moved with magic");
        super.move();
    }

    public String toString() {
        return "Witch - " + super.toString();
    }
}

