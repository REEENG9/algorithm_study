package week6;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
* 백준 7576번
* 토마토 (https://www.acmicpc.net/problem/7576)
* 분류 : 그래프 이론, 그래프 탐색, 너비 우선 탐색
*/
public class Problem30 {
    static Queue<int[]> q = new LinkedList<>();
    static int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}}; // 방향 탐색
    static int[][] tomato;
    static int maxDay = 0;
    static int N = 0;
    static int M = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken()); // 배열 가로
        N = Integer.parseInt(st.nextToken()); // 배열 세로

        tomato = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++)
                tomato[i][j] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < tomato.length; i++) { // 시작지점 큐에 추가
            for (int j = 0; j < tomato[i].length; j++) {
                if (tomato[i][j] == 1)
                    q.offer(new int[] {i,j,0});
            }
        }
        if (check() == 0) // bfs전 모두 익은 상황
            bw.write("0");
        else {
            bfs();
            if (check() == 0) // 모두 익은 상황
                bw.write(maxDay+"");
            else // 익지 못한 상황
                bw.write("-1");
        }
            
        
        bw.flush();
        bw.close();
    }

    public static void bfs() {
        while (!q.isEmpty()) {
            int[] temp = q.poll();
            int days = temp[2];
            if(days > maxDay) // 최대일수 갱신
                maxDay = days;
            for (int i = 0 ; i < direct.length; i++) {
                int row = temp[0] + direct[i][0];
                int col = temp[1] + direct[i][1];
                if (row < 0 || row >= tomato.length || col < 0 || col >= tomato[0].length || tomato[row][col] == -1 || tomato[row][col] == 1)
                    continue;
                q.offer(new int[] {row,col,days+1});
                tomato[row][col] = 1; // 탐색 완료
            }
        }
    }

    public static int check() {
        for (int i = 0; i < N; i++) { // 익지않은 토마토 발견
            for (int j = 0; j < M; j++) {
                if (tomato[i][j] == 0)
                    return -1;
            }
        }
        return 0; // 모두 익었으면
    }
}