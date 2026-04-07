package animals;

import animals.carnivorous.EnergyConsumption;
import animals.food.Food;
import animals.food.WrongFoodException;

public abstract class Animals {
    protected int satiety;
    protected String name;
    private AviarySize aviarySize;

    public AviarySize getAviarySize() {
        return aviarySize;
    }

    public void setAviarySize(AviarySize aviarySize) {
        this.aviarySize = aviarySize;
    }

    public String getName() {
        return name;
    }

    public abstract void eat(Food food) throws WrongFoodException;

    public boolean checkHungry() {
        if (satiety <= 0) {
            satiety = 0;
            System.out.println("Недостаточно энергии, нужно покормить животное");
            return true;
        }
        return false;
    }

    public void currentSatiety() {
        System.out.println("Текущая сытость " + getClass().getSimpleName() + ": " + satiety);
    }

    public void addSatiety(int energy) {
        satiety += energy;
    }

    public void printInfo() {
        System.out.println("Животное: " + getClass().getSimpleName() + " по имени: " + name + "\t" + " Cытость: " + satiety);
    }

    public void action(EnergyConsumption ec) {
        satiety -= ec.getConsumption();
        if (checkHungry()) {
            currentSatiety();
        } else {
            String action = ec.getAction();
            System.out.println(getClass().getSimpleName() + " " + action);
        }
    }

}