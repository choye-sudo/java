package franchise;


import team.Person;

public class Store implements StoreAction{
    private String name;
    private int openTime;
    private int closeTime;
    private Food[] menus;
    private double averagePrice;
    private int menuCount;
    private long totalPrice;

    public Store(String name, int openTime, int closeTime, Food[] menus) {
        if(menus.length>7) System.out.println("가게 생성에 실패하였습니다. 메뉴를 7개 이하로 설정해주세요.");
        else{
            this.name = name;
            this.openTime = openTime;
            this.closeTime = closeTime;
            this.menus = menus;
            this.calc();
        }
    }

    public void calc(){
        this.totalPrice = 0;
        for(Food f : menus){
            if(f != null) this.totalPrice += f.price;
        }
        this.menuCount = menus.length;
        this.averagePrice = this.totalPrice/this.menuCount;
    }

    @Override
    public void print() {
        System.out.println("store name : " + this.name);
        System.out.println("open : " + this.openTime);
        System.out.println("close : " + this.closeTime);
        System.out.println("=====");

        System.out.println("[menu]");
        for(int i = 0; i<this.menus.length; i++){
            if(menus[i] != null){
                System.out.println("name : "+menus[i].name);
                System.out.println("price : "+menus[i].price);
                System.out.println("-----");
            }
        }
        System.out.println("=====");

        System.out.println("total average : " + this.averagePrice);
        System.out.println("menu number : " + this.menuCount);
        System.out.println("total price : " + this.totalPrice);
    }

    @Override
    public boolean addMenu(Food food) {
        for(int i = 0; i<this.menus.length; i++){
            if(this.menus[i] == null){
                this.menus[i] = food;
                this.calc();
                return true;
            }
        }
        if(this.menus.length<7){
            Food[] newMenu = new Food[this.menus.length+1];
            for(int i = 0; i<this.menus.length; i++){
                newMenu[i] = this.menus[i];
            }
            newMenu[this.menus.length] = food;
            this.menus = newMenu;
            return true;
        }
        return false;
    }

    @Override
    public boolean removeMenu(String name) {
        for(int i = 0; i<this.menus.length; i++){
            if(this.menus[i].name == name){
                this.menus[i] = null;
                this.calc();
                return true;
            }
        }
        return false;
    }

    @Override
    public String getMenuArr() {
        String st = "";
        for(int i = 0; i<this.menus.length; i++){
            if(this.menus[i] != null){
                st += "{"+this.menus[i].name+", "+this.menus[i].price+", "+materialsToString(this.menus[i].materials)+"}";
            }
        }
        return st;
    }

    public String materialsToString(String[] m){
        String st = "";
        st+="{";
        for(int i = 0; i<m.length; i++){
            if(i == m.length-1) st += m[i];
            else st += m[i]+",";
        }
        st+="}";
        return st;
    }
}