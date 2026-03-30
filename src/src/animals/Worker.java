package animals;

import animals.actions.Voice;
import animals.food.Food;

public class Worker {

    public void feed(Animals animals, Food food) {
        animals.eat(food);
    }

    public void getVoice(Voice animals) {
        System.out.println(animals.voice());
    }
}
