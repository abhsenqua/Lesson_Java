import animals.food.Grass;
import animals.food.Meat;
import animals.herbivore.Duck;
import animals.herbivore.Horse;

public class Zoo {
    public static void main(String[] args) {

        Grass grass = new Grass();
        Meat meat = new Meat();
        Horse horse = new Horse();
        Duck duck = new Duck();
        duck.eat(meat);
        horse.eat(grass);
    }
}