package animals.carnivorous;

import animals.Animals;
import animals.food.Food;
import animals.food.Meat;

public abstract class Carnivorous extends Animals {

    @Override
    public void eat(Food food) {
        if (food instanceof Meat) {
            System.out.println("Хищики едят: " + food);
        } else {
            System.out.println("Неверный тип: " + food);
        }
    }
}