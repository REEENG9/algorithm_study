package week5;
import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * 백준 2667번
 * 단자번호붙이기
 * 분류 : 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 */
public class Problem29 {
    static int[][] direct = {{-1,0},{1,0},{0,-1},{0,1}}; // 방향 탐색
    static int [][] apart;
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 정사각형 크기
        
        apart = new int[T][T]; // T*T 배열 선언 후 테스트 케이스 입력
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            for (int j = 0; j < T; j++) {
                apart[i][j] = str.charAt(j) - '0';
            }
        }

        int apartment = 0; // 단지 개수
        ArrayList<Integer> apartNum = new ArrayList<>(); // 단지 내 집의 수
        for (int j = 0; j < apart.length; j++) { // 단지 탐색
            for (int k = 0; k < apart[j].length; k++) {
                if (apart[j][k] == 1) {
                    count = 0;
                    dfs(j,k);
                    apartNum.add(count);
                    apartment++;
                }
            }
        }
        // 단지 개수 출력
        bw.write(apartment+"");
        bw.newLine();
        // 단지 내 아파트 개수 출력
        apartNum.sort(Comparator.naturalOrder());
        for (int i = 0; i < apartNum.size(); i++) {
            bw.write(apartNum.get(i)+"");
            if (i != apartNum.size()-1)
                bw.newLine();
        }

        bw.flush();
        bw.close();
    }
    
    public static void dfs(int r, int c) {
        count++;
        apart[r][c] = -1; // 탐색 완료
        for (int i = 0; i < direct.length; i++) { // 상하좌우 탐색
            int R = r + direct[i][0];
            int C = c + direct[i][1];

            if (R < 0 || R >= apart.length || C < 0 || C >= apart[r].length || apart[R][C] == 0 || apart[R][C] == -1)
                continue;
            dfs(R,C);
        }
    }
}
