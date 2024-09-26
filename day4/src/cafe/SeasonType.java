package cafe;

public enum SeasonType {
    Spring("warm"), Summer("hot"), Autumn("cool"), Winter("cold"), All("nope");
    public String description;
    SeasonType(String description) {
        this.description = description;
    }
}
