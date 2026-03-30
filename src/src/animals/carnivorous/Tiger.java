package animals.carnivorous;

import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Food;

public class Tiger extends Carnivorous implements Run, Voice {
    @Override
    public String run() {
        return getClass().getSimpleName() + " бежит";
    }

    @Override
    public String voice() {
        return getClass().getSimpleName() + " рычит";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
