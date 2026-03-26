package animals.carnivorous;

import animals.actions.Swim;
import animals.food.Meat;

public class Shark extends Carnivorous implements Swim {

    @Override
    public String swim() {
        return "плывет";
    }

    public void eat(Meat meat) {
        System.out.println("Акула ест: " + meat);
    }
}
