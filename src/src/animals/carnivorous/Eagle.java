package animals.carnivorous;

import animals.actions.Fly;
import animals.actions.Voice;
import animals.food.Meat;

public class Eagle extends Carnivorous implements Fly, Voice {

    @Override
    public String fly() {
        return "летает";
    }

    @Override
    public String voice() {
        return "издает клекот";
    }

    public void eat(Meat meat) {
        System.out.println("Орел ест: " + meat);
    }
}