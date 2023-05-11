public class App {

    public static void main(String[] args) {
        
        Hero hero1 = new Hero(0, 0);
        hero1.move();  
        hero1.move("up"); 

        Enemy enemy1 = new Enemy(10, 10);
        enemy1.move();  
        enemy1.move(5);  

        Character character1 = new Hero(20, 20);
        character1.move(); 
        Character character2 = new Enemy(30, 30);
        ((Enemy) character2).move(3); 
        Character character3 = new Witch(40, 40);
        character3.move(); 
        Character character4 = new Fighter(50, 50);
        character4.move(); 

        Witch witch1 = new Witch(60, 60);
        witch1.move();
        Fighter fighter1 = new Fighter(witch1.x, witch1.y);
        fighter1.move();
    }
}
