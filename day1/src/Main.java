//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) { // acronym : psvm
        int[] coffeePrices1 = {6000, 7000, 8000};
        int[] coffeePrices2 = new int[3];
        coffeePrices2[0] = 6000;
        coffeePrices2[1] = 7000;
        coffeePrices2[2] = 8000;

        boolean isSame = true;

        if(coffeePrices1.length == coffeePrices2.length){
            for(int i = 0; i<coffeePrices1.length; i++){
                if(coffeePrices1[i] != coffeePrices2[i]){
                    isSame = false;
                    break;
                }
            }
        }
        else{
            isSame = false;
        }

        System.out.println(isSame);

        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};

        //3-1
        for(int i = array.length-1; i>=0; i--){
            for(int j = array[0].length-1; j>=0; j--) {
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //3-2
        for(int i = 0; i<array.length; i++){
            for(int j = 0; j<array[0].length; j++) {
                System.out.print(array[j][i]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //3-3
        int newI = 0;
        int newJ = 0;
        for(int i = 0; i<array.length; i++){
            if(i==array.length-1) newI = 0;
            else newI = i+1;
            for(int j = 0; j<array[0].length; j++) {
                if(j==array[0].length-1) newJ = 0;
                else newJ = j+1;
                System.out.print(array[newI][newJ]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //3-3-2
        for(int i = 0; i<array.length; i++){
            if(i==array.length-1) newI = 0;
            else newI = i+1;
            for(int j = 0; j<array[0].length; j++) {
                if(j==0) newJ = array[0].length-1;
                else newJ = j-1;
                System.out.print(array[newI][newJ]+" ");
            }
            System.out.println();
        }
        System.out.println();

    }
}