package animals.carnivorous;

import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Food;

public class Tiger extends Carnivorous implements Run, Voice {
    public Tiger(int satiety) {
        this.satiety = satiety;
    }

    @Override
    public void run() {
        satiety -= EnergyConsumption.RUN.getConsumption();
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