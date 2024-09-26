package test;
import java.util.*;
import java.lang.*;

public class Solution {
    int minDis;
    int tmpDis;
    int[] dirR = {1, 0, -1, 0};
    int[] dirC = {0, 1, 0, -1};
    boolean[][] isVisit = new boolean[5][5];

    public Solution() {
        minDis = Integer.MAX_VALUE;
        tmpDis = 0;
    }

    public int solve(int[][] map, int r, int c){
        if(tmpDis>minDis || (r==4 && c==4)){
            minDis = Math.min(tmpDis, minDis);
        }
        else{
            for(int i = 0; i<4; i++){
                if(r+dirR[i]>4 || c+dirC[i]>4 || r+dirR[i]<0 || c+dirC[i]<0);
                else if(!isVisit[r+dirR[i]][c+dirC[i]] && map[r+dirR[i]][c+dirC[i]] == 1){
                    tmpDis++;
                    isVisit[r+dirR[i]][c+dirC[i]] = true;
                    solve(map, r+dirR[i], c+dirC[i]);
                    tmpDis--;
                    isVisit[r+dirR[i]][c+dirC[i]] = false;
                }
            }
        }
        return minDis;
    }
}
