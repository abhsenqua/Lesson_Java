package animals.carnivorous;

import animals.AviarySize;
import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Food;
import animals.food.WrongFoodException;

public class Tiger extends Carnivorous implements Run, Voice {
    public Tiger(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
        setAviarySize(AviarySize.EXTRA_LARGE);
    }

    @Override
    public void run() {
        action(EnergyConsumption.RUN);
    }

    @Override
    public void voice() {
      action(EnergyConsumption.VOICE);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}