package animals.carnivorous;

import animals.AviarySize;
import animals.actions.Fly;
import animals.actions.Voice;
import animals.food.Food;
import animals.food.WrongFoodException;

public class Eagle extends Carnivorous implements Fly, Voice {
    public Eagle(String name, int satiety) {
        this.name = name;
        this.satiety = satiety;
        setAviarySize(AviarySize.EXTRA_LARGE);
    }

    @Override
    public void fly() {
        action(EnergyConsumption.FLY);
    }

    @Override
    public void voice() {
       action(EnergyConsumption.VOICE);
    }

    @Override
    public String toString() {
        return "Eagle{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}