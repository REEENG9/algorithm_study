package week6;
import java.io.*;
import java.util.StringTokenizer;
/**
 * 백준 1074번
 * Z
 * 분류 : 분할 정복, 재귀
 */
public class Problem32 {
    static int result = 0;
    static int r, c;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        
        recur(1<<N,0,0); // 2의 제곱수 = 이진수이므로 비트마스킹
    }

    public static void recur(int N, int row, int col) {
        if (row == r && col == c) { // 1. 좌표를 찾는 즉시 값을 출력
            System.out.println(result+"");
            return;
        }
        
        // 참고 : 행과 열마다 1. 입력값이 범위 최소보다 작을 때 2. 입력값이 범위 최대보다 크거나 같을 때 범위를 벗어남
        if (r < row || r >= row+N || c < col || c >= col+N) { // 2. 범위 안에 찾는 좌표가 없을 시 방문처리
            result += N*N;
            return;
        }
        else {
            recur(N/2,row,col); // 2사분면
            recur(N/2,row,col+N/2); // 1사분면
            recur(N/2,row+N/2,col); // 3사분면
            recur(N/2,row+N/2,col+N/2); // 4사분면
        }
    }
}