package animals;

import animals.actions.Voice;
import animals.food.Food;

public class Worker {

    public void feed(Animals animals, Food food) {
        animals.eat(food);
    }

    public void getVoice(Voice animals) {
        animals.voice();
    }
}
