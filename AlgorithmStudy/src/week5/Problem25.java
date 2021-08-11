package week5;
import java.util.*;
import java.io.*;

/**
 * 백준 1780번
 * 종이의 개수
 * 분류 : 분할 정복, 재귀
 */
public class Problem25 {
    static int[] result; // 종이의 개수
    static int[][] array; // 테스트 케이스 배열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        array = new int[N][N];
        result = new int[3];
        for (int i = 0; i < N; i++) { // 테스트 케이스 채우기
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++)
                array[i][j] = Integer.parseInt(st.nextToken());
        }

        cut(N,0,0);

        for (int i : result) { // 종이 개수 출력
            bw.write(i+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static void cut(int n, int r, int c) {
        boolean same = true;
        int check = array[r][c]; // 범위의 첫 값과 일치하는지 판별
        for (int i = r; i < r+n; i++) { // 주어진 범위의 배열을 순회하여 다른 값이 나오면 반복 탈출
            for (int j = c; j < c+n; j++) {
                if (array[i][j] != check) {
                    same = false;
                    break;
                }
            }
            if (!same)
                break;
        }

        if (same || n == 1) { // 모든 값이 같거나 크기가 1일때 재귀 탈출
            if (check == -1)
                result[0]++;
            else if (check == 0)
                result[1]++;
            else
                result[2]++;
        }

        else {
            cut(n/3,r,c);
            cut(n/3,r,c+n/3);
            cut(n/3,r,c+2*n/3);

            cut(n/3,r+n/3,c);
            cut(n/3,r+n/3,c+n/3);
            cut(n/3,r+n/3,c+2*n/3);

            cut(n/3,r+2*n/3,c);
            cut(n/3,r+2*n/3,c+n/3);
            cut(n/3,r+2*n/3,c+2*n/3);
        }
    }
}
