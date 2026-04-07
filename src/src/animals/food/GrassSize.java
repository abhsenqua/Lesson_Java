package animals.food;

public enum GrassSize {
    SMALL("небольшая порция травы", 10),
    MEDIUM("средняя порция травы", 20),
    LARGE("большая порция травы", 30);

    private String size;
    private int energy;

    GrassSize(String size, int energy) {
        this.size = size;
        this.energy = energy;
    }

    public int getEnergy() {
        return energy;
    }

    public String getSize() {
        return size;
    }
}
