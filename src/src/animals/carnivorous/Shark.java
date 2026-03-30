package animals.carnivorous;

import animals.actions.Swim;
import animals.food.Food;


public class Shark extends Carnivorous implements Swim {
    @Override
    public String swim() {
        return getClass().getSimpleName() + " плывет";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
