import animals.Animals;
import animals.AviarySize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Aviary<T extends Animals> {
    private AviarySize aviarySize;

    public Aviary(String name, AviarySize aviarySize) {
        this.aviarySize = aviarySize;
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    private HashMap<String, T> aviary = new HashMap<>();

    public String addAnimal(T animals) {
        if (animals.getAviarySize() != aviarySize) {
            System.out.println("Неверный размер для животного");
        } else {
           aviary.put(animals.getName(), animals);

        }
        return animals.getName();
    }

    public T removeAnimal(String name) {
        return aviary.remove(name);
    }

    public T getAnimal(String name) {
        return aviary.get(name);
    }

    public List<T> getAnimals() {
        return new ArrayList<>(aviary.values());
    }

    @Override
    public String toString() {
        return "Aviary: " + name + " - " + aviary.values();
    }
}
