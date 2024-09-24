// import team.*;
import franchise.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        Food hamburger = new Food("햄버거", new String[]{"햄", "빵", "고기"}, 5600);
//        hamburger.printIngredients();
//
//        Person p1 = new Person("양예현", 22);
//        Person p2 = new Person("조예은", 23);
//        Person p3 = new Person("김현숙", 24);
//
//        Team conquest = new Team("예현이의 우주정복", new Person[]{p1, p2, p3}, "우주정복");
//        conquest.printTeam();
//        conquest.remove("조예은");
//        conquest.printTeam();
//        conquest.addMember("박성무", 35);
//        conquest.printTeam();

        Food f1 = new Food("치즈돈까스", 8900, new String[]{"치즈", "돼지", "밀가루", "데미그라스소스", "양배추"});
        Food f2 = new Food("경양식돈까스", 10500, new String[]{"돼지", "밀가루", "데미그라스소스", "단무지"});
        Food f3 = new Food("매콤돈까스", 12400, new String[]{"돼지", "밀가루", "치킨양념소스", "청양고추"});
        Food f4 = new Food("로제돈까스", 13000, new String[]{"치즈", "돼지", "밀가루", "토마토 소스", "크림 소스"});

        Store s = new Store("엠브로돈까스", 9, 21, new Food[]{f1, f2, f3});
        s.print();
        System.out.println(s.getMenuArr());
        if(s.addMenu(f4)){
            System.out.println("메뉴 추가 성공!");
        }
        else{
            System.out.println("메뉴 추가 실패!");
        }
        s.print();

        if(s.removeMenu("매콤돈까스")){
            System.out.println("메뉴 삭제 성공!");
        }
        else{
            System.out.println("메뉴 삭제 실패!");
        }
        s.print();
    }
}