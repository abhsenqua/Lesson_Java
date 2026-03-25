package animals.herbivore;

import animals.actions.Run;
import animals.actions.Voice;

public class Elephant extends Herbivore implements Run, Voice {

    @Override
    public String run() {
        return "бежит";
    }

    @Override
    public String voice() {
        return "издает звук";
    }
}
