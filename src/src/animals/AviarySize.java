package animals;

public enum AviarySize {
    SMALL("небольшой вольер"),
    MEDIUM("средний вольер"),
    LARGE("большой вольер"),
    EXTRA_LARGE("огромный вольер");

    private String aviarySize;

    AviarySize(String aviarySize) {
        this.aviarySize = aviarySize;
    }

    public String getAviarySize() {
        return aviarySize;
    }
}
