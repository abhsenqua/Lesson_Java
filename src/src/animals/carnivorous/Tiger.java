package animals.carnivorous;

import animals.actions.Run;
import animals.actions.Voice;
import animals.food.Meat;

public class Tiger extends Carnivorous implements Run, Voice {

    @Override
    public String run() {
        return "бежит";
    }

    @Override
    public String voice() {
        return "рычит";
    }

    public void eat(Meat meat) {
        System.out.println("Тигр ест: " + meat);
    }
}
