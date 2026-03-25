package animals.carnivorous;

import animals.actions.Swim;
import animals.actions.Voice;

public class Shark extends Carnivorous implements Swim {
    @Override
    public String swim() {
        return "плывет";
    }
}
