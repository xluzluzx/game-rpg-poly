public abstract class Character {
    protected int x;
    protected int y;

    public Character(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract void move();

    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

