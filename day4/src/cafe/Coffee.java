package cafe;

public class Coffee {
    private String name;
    private int price;
    private SeasonType season; // Spring, Summer, Autumn, Winter, All
    private Category category; // 커피 티 에이드
    //  팩토리 메서드
    public static Coffee of(String[] strings){
        String name = strings[0];
        int price = Integer.parseInt(strings[1]);
        String season = strings[2];
        String category = strings[3];
        if(!category.equals("커피")) return null;
        return new Coffee(name, price, season, category);
    }

    private Coffee(String name, int price, String season, String category) {
        this.name = name;
        this.price = price;
        this.season = season;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", season='" + season + '\'' +
                ", type='" + category + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getSeason() {
        return season;
    }

    public String getCategory() {
        return category;
    }
}