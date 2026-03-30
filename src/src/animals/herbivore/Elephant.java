package animals.herbivore;

import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Food;

public class Elephant extends Herbivore implements Run, Voice {
    @Override
    public String run() {
        return getClass().getSimpleName() + " бежит";
    }

    @Override
    public String voice() {
        return getClass().getSimpleName() + " издает трубный звук";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
