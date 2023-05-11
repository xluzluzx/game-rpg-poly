public class Hero extends Character {
    public Hero(int x, int y) {
        super(x, y);
    }

    public void move() {
        System.out.println("Hero moved to the right");
        x += 1;
    }

    public void move(String direction) {
        System.out.println("Hero moved " + direction);
        if (direction.equals("up")) {
            y -= 1;
        } else if (direction.equals("down")) {
            y += 1;
        } else if (direction.equals("left")) {
            x -= 1;
        } else if (direction.equals("right")) {
            x += 1;
        }
    }

    public String toString() {
        return "Hero - " + super.toString();
    }
}
