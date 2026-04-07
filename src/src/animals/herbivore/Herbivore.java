package animals.herbivore;

import animals.Animals;
import animals.food.*;

public abstract class Herbivore extends Animals {
    @Override
    public void eat(Food food) throws WrongFoodException {
        if (food instanceof Grass) {
            addSatiety(food.getEnergy());
            if (satiety >= 100) {
                satiety = 100;
                System.out.println("У животного: " + getClass().getSimpleName() + " максимум энергии: " + satiety);
            } else {
                System.out.println(getClass().getSimpleName() + " ест " + food);
                currentSatiety();
            }
        } else {
           throw new WrongFoodException("Травоядные не едят мясо");
        }
    }
}
