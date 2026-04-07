package animals.food;

public class Meat extends Food {
    private MeatSize meatSize;

    public Meat(MeatSize meatSize) {
        this.meatSize = meatSize;
    }

    public MeatSize getMeatSize() {
        return meatSize;
    }

    @Override
    public String toString() {
        return getMeatSize().getSize();
    }

    @Override
    public int getEnergy() {
        return getMeatSize().getEnergy();

    }
}
