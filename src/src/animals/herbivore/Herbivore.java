package animals.herbivore;

import animals.Animals;
import animals.food.Food;
import animals.food.Grass;
import animals.food.Meat;
import animals.food.MeatSize;

public abstract class Herbivore extends Animals {
    @Override
    public void eat(Food food) {
        if (food instanceof Grass) {
            addSatiety(getEnergyFromFood(food));
            if (satiety >= 100) {
                satiety = 100;
                System.out.println("У животного: " + getClass().getSimpleName() + " максимум энергии: " + satiety);
            } else {
                System.out.println(getClass().getSimpleName() + " ест " + food);
                currentSatiety();
            }
        } else {
            System.out.println("Неверный тип: " + food);
        }
    }

    public int getEnergyFromFood(Food food) {
        MeatSize meatSize = ((Meat) food).getMeatSize();
        int energy = meatSize.getEnergy();
        return energy;
    }
}
