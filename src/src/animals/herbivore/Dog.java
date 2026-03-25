package animals.herbivore;

import animals.actions.Run;
import animals.actions.Voice;

public class Dog extends Herbivore implements Voice, Run {

    @Override
    public String run() {
        return "бежит";
    }

    @Override
    public String voice() {
        return "гавкает";
    }
}
