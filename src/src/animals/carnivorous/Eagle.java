package animals.carnivorous;

import animals.actions.Fly;
import animals.actions.Voice;
import animals.food.Food;

public class Eagle extends Carnivorous implements Fly, Voice {
    @Override
    public String fly() {
        return getClass().getSimpleName() + " летает";
    }

    @Override
    public String voice() {
        return getClass().getSimpleName() + " издает клекот";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}