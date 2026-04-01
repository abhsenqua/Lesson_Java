package animals.carnivorous;

public enum EnergyConsumption {
    RUN(30, "бежит"),
    SWIM(30, "плывет"),
    FLY(35, "летит"),
    VOICE(10, "издаёт звук");

    private int consumption;
    private String action;

    EnergyConsumption(int consumption, String action) {
        this.consumption = consumption;
        this.action = action;
    }

    public int getConsumption() {
        return consumption;
    }

    public String getAction() {
        return action;
    }
}
