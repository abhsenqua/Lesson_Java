package animals.food;

public enum MeatSize {
    SMALL("маленький кусок мяса", 10),
    MEDIUM("средний кусок мяса", 20),
    LARGE("большой кусок мяса", 30);

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
