import animals.Worker;
import animals.actions.Swim;
import animals.carnivorous.Shark;
import animals.carnivorous.Tiger;
import animals.food.Grass;
import animals.food.Meat;
import animals.herbivore.Duck;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Meat meat = new Meat();
        Grass grass = new Grass();

        Tiger tiger = new Tiger();
        tiger.eat(meat);
        tiger.eat(grass);

        Swim duck = new Duck();
        Swim shark = new Shark();

        Worker worker = new Worker();
        worker.getVoice(tiger);
        worker.feed(tiger, meat);

        List<Swim> animalsPond =  new ArrayList<Swim>();
        animalsPond.add(duck);
        animalsPond.add(shark);

        for (Swim animals : animalsPond) {
            var swim = animals.swim();
            System.out.println(swim);
        }

    }
}