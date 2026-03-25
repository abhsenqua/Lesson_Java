package animals.herbivore;

import animals.actions.Swim;

public class Duck extends Herbivore implements Swim {
    @Override
    public String swim() {
        return "плывет";
    }
}
