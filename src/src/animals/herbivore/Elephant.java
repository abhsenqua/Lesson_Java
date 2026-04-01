package animals.herbivore;

import animals.actions.Run;
import animals.actions.Voice;
import animals.carnivorous.EnergyConsumption;
import animals.food.Food;

public class Elephant extends Herbivore implements Run,Voice {
    @Override
    public void run() {
        satiety -= EnergyConsumption.VOICE.getConsumption();
        if (checkHungry()) {
            currentSatiety();
        } else {
            String action = EnergyConsumption.RUN.getAction();
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
