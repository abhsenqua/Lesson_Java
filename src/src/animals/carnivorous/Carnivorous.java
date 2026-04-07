package animals.carnivorous;

import animals.Animals;
import animals.food.Food;
import animals.food.Meat;
import animals.food.WrongFoodException;

public abstract class Carnivorous extends Animals {
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Meat) {
            addSatiety(food.getEnergy());
            if (satiety >= 100) {
                satiety = 100;
                System.out.println("У животного: " + getClass().getSimpleName() + " максимум энергии: " + satiety);
            } else {
                System.out.println(getClass().getSimpleName() + " ест " + food);
                currentSatiety();
            }
        } else {
            throw new WrongFoodException("Хищники не едят траву");
        }
    }
}