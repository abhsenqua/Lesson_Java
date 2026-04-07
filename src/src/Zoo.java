import animals.AviarySize;
import animals.Worker;
import animals.actions.Swim;
import animals.carnivorous.Carnivorous;
import animals.carnivorous.Eagle;
import animals.carnivorous.Shark;
import animals.carnivorous.Tiger;
import animals.food.*;
import animals.herbivore.Duck;
import animals.herbivore.Elephant;
import animals.herbivore.Herbivore;
import animals.herbivore.Horse;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    public static void main(String[] args) throws WrongFoodException {
        Meat meatOne = new Meat(MeatSize.SMALL);
        Meat meatTwo = new Meat(MeatSize.MEDIUM);
        Meat meatThree = new Meat(MeatSize.LARGE);

        Grass grass = new Grass(GrassSize.SMALL);

        Tiger tiger = new Tiger("Адульп", 100);

        try {
            tiger.eat(grass);
            tiger.eat(meatThree);
            tiger.eat(meatTwo);
        } catch (Exception e) {
            System.out.println("Неверный тип еды");
        }
        tiger.voice();
        tiger.run();
        tiger.printInfo();

        System.out.println();

        Duck duck = new Duck("Donald", 100);
        duck.printInfo();
        duck.swim();
        duck.voice();
        duck.printInfo();
        System.out.println();
        Shark shark = new Shark("Tom", 100);
        shark.swim();
        System.out.println();
        Horse horse = new Horse("Sindy", 100);
        horse.voice();
        horse.run();

        Eagle eagle = new Eagle("Mike", 50);

        Elephant elephant = new Elephant("Sam", 100);

        Swim duckInPond = new Duck("Donald Duck", 100);
        Swim sharkInPond = new Shark("Tomas", 100);

        Worker worker = new Worker();
        worker.getVoice(tiger);
        worker.feed(tiger, meatOne);

        List<Swim> animalsPond =  new ArrayList<Swim>();
        animalsPond.add(duckInPond);
        animalsPond.add(sharkInPond);

        for (Swim animals : animalsPond) {
            animals.swim();
        }

        Aviary<Carnivorous> carnivorousAviary = new Aviary<>("Хищники", AviarySize.EXTRA_LARGE);
        carnivorousAviary.addAnimal(tiger);
        carnivorousAviary.addAnimal(eagle);
        System.out.println(carnivorousAviary);

        Aviary<Herbivore> herbivoreAviary = new Aviary<>("Травоядные", AviarySize.EXTRA_LARGE);
        herbivoreAviary.addAnimal(horse);
        herbivoreAviary.addAnimal(elephant);
        System.out.println(herbivoreAviary);

        horse.eat(grass);
        worker.feed(tiger, grass);
        eagle.eat(meatOne);

    }
}