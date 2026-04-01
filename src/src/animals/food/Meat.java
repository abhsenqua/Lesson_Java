package animals.food;

public class Meat extends Food {
    MeatSize meatSize;

    public Meat(MeatSize meatSize) {
        this.meatSize = meatSize;
    }

    public MeatSize getMeatSize() {
        return meatSize;
    }

    @Override
    public String toString() {
        return "мясо";
    }
}
