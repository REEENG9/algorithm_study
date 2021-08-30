package week7;
import java.io.*;

/**
 * 백준 10026번
 * 적록색약 (https://www.acmicpc.net/problem/10026)
 * 분류 : 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 */
public class Problem35 {
    static int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}}; // 방향 탐색
    static char[][] board;
    static boolean[][] visited;
    static int N;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count1 = 0;
        int count2 = 0;
        N = Integer.parseInt(br.readLine());
        board = new char[N][N];
        visited = new boolean[N][N];

        for (int i = 0; i < N; i++) { // 배열 채우기
            String str = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = str.charAt(j);
            }
        }
        
        for (int i = 0; i < board.length; i++) { // RGB 탐색 (비색약인)
            for (int j = 0; j < board[i].length; j++) {
                char alpha = board[i][j];
                if (!visited[i][j]) {
                    dfs(i,j,alpha);
                    count1++;
                }
            }
        }

        visited = new boolean[N][N]; // 배열 초기화

        for (int i = 0; i < board.length; i++) { // RGB 탐색 (적록색약인)
            for (int j = 0; j < board[i].length; j++) {
                char alpha = board[i][j];
                if (!visited[i][j]) {
                    dfs2(i,j,alpha);
                    count2++;
                }
            }
        }

        bw.write(count1+" "+count2);
        bw.flush();
        bw.close();
    }

    public static void dfs(int r, int c, char alpha) { // 비색약인
        visited[r][c] = true; // 탐색 완료
        for (int i = 0; i < direct.length; i++) { // 상하좌우 탐색
            int R = r + direct[i][0];
            int C = c + direct[i][1];

            if (R < 0 || R >= board.length || C < 0 || C >= board[r].length || board[R][C] != alpha || visited[R][C] == true)
                continue;
            dfs(R,C,alpha);
        }
    }

    public static void dfs2(int r, int c, char alpha) { // 적록색약인
        visited[r][c] = true; // 탐색 완료
        for (int i = 0; i < direct.length; i++) { // 상하좌우 탐색
            int R = r + direct[i][0];
            int C = c + direct[i][1];

            if (alpha == 'R' || alpha == 'G') {
                if (R < 0 || R >= board.length || C < 0 || C >= board[r].length || board[R][C] == 'B' || visited[R][C] == true)
                    continue;
                dfs2(R,C,alpha);
            }
            else {
                if (R < 0 || R >= board.length || C < 0 || C >= board[r].length || board[R][C] != alpha || visited[R][C] == true)
                    continue;
                dfs2(R,C,alpha);
            }
        }
    }
}
