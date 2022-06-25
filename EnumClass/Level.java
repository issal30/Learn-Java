package EnumClass;

public enum Level {
    STANDART("Level Standart"),
    PREMIUM("Level Premium"),
    VIP("Level VIP");
private String description;

    Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
