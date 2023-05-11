public class Fighter extends Hero {
    public Fighter(int x, int y) {
        super(x, y);
    }

    public void move() {
        System.out.println("Fighter moved to the front");
        y += 1;
    }

    public String toString() {
        return "Fighter - " + super.toString();
    }
}

