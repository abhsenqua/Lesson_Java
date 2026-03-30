package animals.herbivore;

import animals.Animals;
import animals.food.Food;
import animals.food.Grass;

public abstract class Herbivore extends Animals {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            System.out.println("Травоядные едят: " + food);
        } else {
            System.out.println("Неверный тип: " + food);
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
