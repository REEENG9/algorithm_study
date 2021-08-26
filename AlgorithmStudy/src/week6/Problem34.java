package week6;
import java.io.*;
import java.util.StringTokenizer;
/**
 * 백준 15649번
 * N과 M (1)
 * 분류 : 백트래킹
 */
public class Problem34 {
    static BufferedWriter bw;
    static boolean[] visited;
    static int[] seq;
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 숫자 (1~N)
        M = Integer.parseInt(st.nextToken()); // 자릿수
        
        visited = new boolean[N+1]; // 방문 체크
        seq = new int[M]; // 수열 저장
        dfs(0);
        bw.flush();
        bw.close();
    }

    public static void dfs(int cnt) throws IOException {
        if (cnt == M) {
            for (int i = 0; i < seq.length; i++)
                bw.write(seq[i]+" ");
            bw.newLine();
            return;
        }

        else {
            for (int i = 1; i <= N; i++) {
                if (!visited[i]) {
                    seq[cnt] = i;
                    visited[i] = true;
                    dfs(cnt+1);
                    visited[i] = false;
                }
            }
        }
    }
    
}
