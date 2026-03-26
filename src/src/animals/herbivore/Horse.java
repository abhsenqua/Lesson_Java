package animals.herbivore;

import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Food;
import animals.food.Grass;

public class Horse extends Herbivore implements Voice, Run {

    @Override
    public String run() {
        return "бежит";
    }

    @Override
    public String voice() {
        return "фыркает";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }

    public void eat(Grass grass) {
        System.out.println("Лошадь ест: " + grass);
    }
}