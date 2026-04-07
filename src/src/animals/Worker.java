package animals;

import animals.actions.Voice;
import animals.food.Food;
import animals.food.WrongFoodException;

public class Worker {
    public void feed(Animals animals, Food food) throws WrongFoodException {
        try {
            animals.eat(food);
        } catch (WrongFoodException wrongFoodException) {
            System.out.println(animals.getClass().getSimpleName() + " не ест такой тип еды: " + food);
        }
    }

    public void getVoice(Voice animals) {
        animals.voice();
    }


}
