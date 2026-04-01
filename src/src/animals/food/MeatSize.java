package animals.food;

public enum MeatSize {

    SMALL("маленький кусок", 10),
    MEDIUM("средний кусок", 20),
    LARGE("большой кусок", 30);

    private String size;
    private int energy;

    MeatSize(String size, int countEnergy) {
        this.size = size;
        this.energy = countEnergy;
    }

    public String getSize() {
        return size;
    }

    public int getEnergy() {
        return energy;
    }
}
