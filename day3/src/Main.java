import custom.CustomArrayList;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        CustomArrayList<Integer> l = new CustomArrayList<>();
//        l.add(1);
//        l.add(2);
//        l.add(3);
//
//        System.out.println("custom list의 크기 : "+l.size());
//
//        for(int i = 0; i<l.size(); i++){
//            System.out.print(l.get(i));
//        }
//        System.out.println("");
//
//        l.remove(1);
//        System.out.println("custom list의 크기 : "+l.size());
//
//        for(int i = 0; i<l.size(); i++){
//            System.out.print(l.get(i));
//        }
//        System.out.println("");

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(9);
        int target = 9;
        int[] answer = new int[2];

        // #1. 시간복잡도 고려 X, 구현만 하기
        /*
        boolean isComplete = false;
        for(int i = 0; i<list.size()-1; i++){
            if (isComplete) break;
            answer[0] = list.get(i);
            for(int j = i+1; j<list.size(); j++){
                answer[1] = list.get(j);
                if(answer[0]+answer[1] == target){
                    isComplete = true;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
         */

        // #2. 시간복잡도 고려 O, 1 =< list 안에 있는 수 =< 10, answer는 list 내의 순서 고려하지 않고 출력
        /*
        boolean[] isInList = new boolean[11];
        for(int i : list){
            if(!isInList[i]) isInList[i] = true;
        }
        for(int i : list){
            if(isInList[target-i]){
                answer[0] = i;
                answer[1] = target-i;
                break;
            }
        }
        System.out.println(Arrays.toString(answer));
         */

        // #3. 시간복잡도 고려 O. 1 =< list 안에 있는 수 =< 10, answer는 list 내의 순서 고려하여 출력
        /*
        Integer[] isInList = new Integer[11];
        for(int i = 0; i<list.size() ; i++){
            if(isInList[list.get(i)] == null) isInList[list.get(i)] = i;
        }
        for(int i = 0; i<isInList.length ; i++){
            if(isInList[i] != null && isInList[target-i] != null){
                if(isInList[i]>isInList[target-i]){
                    answer[0] = target-i;
                    answer[1] = i;
                }
                else{
                    answer[0] = i;
                    answer[1] = target-i;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
         */

        // #4. 시간복잡도 고려 O
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<list.size() ; i++){
            if(!map.containsKey(list.get(i))) map.put(list.get(i), i);
            if(map.containsKey(target - list.get(i))){
                if(map.get(list.get(i))>map.get(target - list.get(i))){
                    answer[0] = target - list.get(i);
                    answer[1] = list.get(i);
                    break;
                }
                else{
                    answer[0] = list.get(i);
                    answer[1] = target - list.get(i);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}