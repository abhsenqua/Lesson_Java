package animals.herbivore;

import animals.AviarySize;
import animals.actions.Run;
import animals.actions.Voice;
import animals.carnivorous.EnergyConsumption;
import animals.food.Food;
import animals.food.WrongFoodException;

public class Elephant extends Herbivore implements Run,Voice {
    public Elephant(String name, int satiety) {
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
        return "Elephant{" +
                "satiety=" + satiety +
                ", name='" + name + '\'' +
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
