import animals.Worker;
import animals.actions.Swim;
import animals.carnivorous.Shark;
import animals.carnivorous.Tiger;
import animals.food.Grass;
import animals.food.Meat;
import animals.food.MeatSize;
import animals.herbivore.Duck;
import animals.herbivore.Horse;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        Meat meatOne = new Meat(MeatSize.SMALL);
        Meat meatTwo = new Meat(MeatSize.MEDIUM);
        Meat meatThree = new Meat(MeatSize.LARGE);

        Grass grass = new Grass();

        Tiger tiger = new Tiger(100);

        tiger.eat(meatThree);
        tiger.voice();
        tiger.run();
        tiger.eat(grass);
        tiger.printInfo();
        tiger.eat(meatThree);

        System.out.println();

        Duck duck = new Duck(100);
        duck.printInfo();
        duck.swim();
        duck.voice();
        duck.printInfo();
        System.out.println();
        Shark shark = new Shark(100);
        shark.swim();
        System.out.println();
        Horse horse = new Horse(100);
        horse.voice();
        horse.run();

        Swim duckInPond = new Duck(100);
        Swim sharkInPond = new Shark(100);

        Worker worker = new Worker();
        worker.getVoice(tiger);
        worker.feed(tiger, meatOne);

        List<Swim> animalsPond =  new ArrayList<Swim>();
        animalsPond.add(duckInPond);
        animalsPond.add(sharkInPond);

        for (Swim animals : animalsPond) {
            animals.swim();
        }
    }
}