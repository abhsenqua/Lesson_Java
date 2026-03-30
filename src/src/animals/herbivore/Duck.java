package animals.herbivore;

import animals.actions.Swim;
import animals.actions.Voice;
import animals.food.Food;

public class Duck extends Herbivore implements Swim, Voice {
    @Override
    public String swim() {
        return getClass().getSimpleName() + " плывет";
    }

    @Override
    public String voice() {
        return getClass().getSimpleName() + " крякает";
    }

    @Override
    public void eat(Food food) {
        super.eat(food);
    }
}
