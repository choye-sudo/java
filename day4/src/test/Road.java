package test;

public class Road {
    public static void main(String[] args) {
        // 출발점 : (0,0), 도착점 : (4,4), 0은 벽, 1은 길
        int[][] map = {
                {1,0,1,1,1},
                {1,0,1,0,1},
                {1,0,1,0,1},
                {1,0,1,1,1},
                {1,1,1,0,1}
        };
        Solution solution = new Solution();
        int minDis = solution.solve(map, 0, 0);
        System.out.println(minDis);
    }
}
