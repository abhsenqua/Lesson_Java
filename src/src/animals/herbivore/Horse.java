package animals.herbivore;

import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Food;

public class Horse extends Herbivore implements Voice, Run {
    @Override
    public String run() {
        return getClass().getSimpleName() + " бежит";
    }

    @Override
    public String voice() {
        return getClass().getSimpleName() + " фыркает";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}