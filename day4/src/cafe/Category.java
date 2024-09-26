package cafe;

public enum Category {
    Coffee("쓰다"), Tea("슴슴하다"), Ade("새그럽다");
    public String description;
    Category(String description) {
        this.description = description;
    }
}
