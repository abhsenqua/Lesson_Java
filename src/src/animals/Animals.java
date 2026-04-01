package animals;

import animals.food.Food;

public abstract class Animals {

    protected int satiety;

    public abstract void eat(Food food);

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
        System.out.println("Животное: " + getClass().getSimpleName() + "\t" + " Cытость: " + satiety);
    }

}