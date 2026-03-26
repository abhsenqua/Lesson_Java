package animals.herbivore;

import animals.actions.Swim;
import animals.actions.Voice;
import animals.food.Grass;

public class Duck extends Herbivore implements Swim, Voice {

    @Override
    public String swim() {
        return "плывет";
    }

    @Override
    public String voice() {
        return "крякает";
    }

    public void eat(Grass grass) {
        System.out.println("Утка ест: " + grass);
    }
}
