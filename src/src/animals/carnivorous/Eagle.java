package animals.carnivorous;

import animals.actions.Fly;
import animals.actions.Voice;

public class Eagle extends Carnivorous implements Fly, Voice {

    @Override
    public String fly() {
        return "летает";
    }

    @Override
    public String voice() {
        return "издает звук";
    }
}
