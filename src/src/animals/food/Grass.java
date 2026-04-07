package animals.food;

public class Grass extends Food {
    private GrassSize grassSize;

    public Grass(GrassSize grassSize) {
        this.grassSize = grassSize;
    }

    public GrassSize getGrassSize() {
        return grassSize;
    }

    @Override
    public String toString() {
        return getGrassSize().getSize();
    }

    @Override
    public int getEnergy() {
        return getGrassSize().getEnergy();
    }
}
