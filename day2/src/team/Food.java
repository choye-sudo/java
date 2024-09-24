package team;

public class Food {
    String menu;
    String[] ingredients;
    int price;

    public Food(String menu, String[] ingredients, int price){
        this.menu = menu;
        this.ingredients = ingredients;
        this.price = price;
    }

    public void printIngredients(){
        int count = 0;
        System.out.println("이 음식은 "+this.menu+"로 가격은 "+this.price+"원 입니다.");
        System.out.print("재료로는 ");
        for(String i:ingredients){
            if(count == ingredients.length-1){
                System.out.print(i);
            }
            else {
                System.out.print(i+", ");
            }
            count++;
        }
        System.out.print("가 존재합니다.");
    }
}
