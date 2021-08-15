package week5;
import java.io.*;
import java.util.StringTokenizer;

/**
 * 백준 1012번
 * 유기농 배추
 * 분류 : 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 */
public class Problem28 {
    static int[][] field;
    static int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}}; // 방향 탐색
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int M = Integer.parseInt(st.nextToken()); // 배추밭 가로
            int N = Integer.parseInt(st.nextToken()); // 배추밭 세로
            int K = Integer.parseInt(st.nextToken()); // 배추 개수

            field = new int[M][N]; // 배추밭 배열
            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken()); 
                int y = Integer.parseInt(st.nextToken());

                field[x][y] = 1;
            }

            int worm = 0; // 지렁이 카운트
            for (int j = 0; j < field.length; j++) { // 배추밭 탐색
                for (int k = 0; k < field[j].length; k++) {
                    if (field[j][k] == 1) {
                        dfs(j,k);
                        worm++;
                    }
                }
            }

            bw.write(worm+"");
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void dfs(int r, int c) {
        field[r][c] = -1; // 탐색 완료
        for (int i = 0; i < direct.length; i++) { // 상하좌우 탐색
            int R = r + direct[i][0];
            int C = c + direct[i][1];

            if (R < 0 || R >= field.length || C < 0 || C >= field[r].length || field[R][C] == 0 || field[R][C] == -1)
                continue;
            dfs(R,C);
        }
    }
}
