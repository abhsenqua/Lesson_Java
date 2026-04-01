package animals.carnivorous;

import animals.actions.Swim;
import animals.food.Food;


public class Shark extends Carnivorous implements Swim {
    public Shark(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public void swim() {
        satiety -= EnergyConsumption.SWIM.getConsumption();
        if (checkHungry()) {
            currentSatiety();
        } else {
            String action = EnergyConsumption.SWIM.getAction();
            System.out.println(getClass().getSimpleName() + " " + action);
        }
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
