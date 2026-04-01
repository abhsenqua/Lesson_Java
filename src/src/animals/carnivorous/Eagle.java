package animals.carnivorous;

import animals.actions.Fly;
import animals.actions.Voice;
import animals.food.Food;

public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public void fly() {
        satiety -= EnergyConsumption.FLY.getConsumption();
        if (checkHungry()) {
            currentSatiety();
        } else {
            String action = EnergyConsumption.FLY.getAction();
            System.out.println(getClass().getSimpleName() + " " + action);
        }
    }

    @Override
    public void voice() {
        satiety -= EnergyConsumption.VOICE.getConsumption();
        if (checkHungry()) {
            currentSatiety();
        } else {
            String action = EnergyConsumption.VOICE.getAction();
            System.out.println(getClass().getSimpleName() + " " + action);
        }
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}