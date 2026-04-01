package animals.herbivore;

import animals.Animals;
import animals.actions.Swim;
import animals.actions.Voice;
import animals.carnivorous.EnergyConsumption;
import animals.food.Food;

public class Duck extends Herbivore implements Swim, Voice {
    public Duck(int satiety) {
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
