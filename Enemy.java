public class Enemy extends Character {
    public Enemy(int x, int y) {
        super(x, y);
    }

    public void move() {
        System.out.println("Enemy moved to the left");
        x -= 1;
    }

    public void move(int step) {
        System.out.println("Enemy moved " + step + " steps");
        x -= step;
    }

    public String toString() {
        return "Enemy - " + super.toString();
    }
}