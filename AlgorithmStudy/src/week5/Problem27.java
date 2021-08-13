package week5;
import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

/**
 * 백준 2606번
 * 바이러스
 * 분류 : 그래프 이론, 그래프 탐색, 너비 우선 탐색, 깊이 우선 탐색
 */
public class Problem27 {
    static ArrayList<Integer>[] graph;
    static int result = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine()); // 컴퓨터 수
        int pair = Integer.parseInt(br.readLine()); // 연결된 컴퓨터 쌍
        boolean[] visited = new boolean[n];
        graph = new ArrayList[n]; // 그래프
        
        for (int i = 0; i < n; i++) // 리스트 초기화
            graph[i] = new ArrayList<>();

        for (int i = 0; i < pair; i++) { // 인접 리스트 채우기
            st = new StringTokenizer(br.readLine());
            int com1 = Integer.parseInt(st.nextToken());
            int com2 = Integer.parseInt(st.nextToken());
            graph[com1-1].add(com2-1);
            graph[com2-1].add(com1-1);
        }

        dfs(0,graph,visited);

        bw.write(result+"");
        bw.flush();
        bw.close();
    }

    public static void dfs(int start, ArrayList<Integer>[] graph, boolean[] visited) {
        visited[start] = true;
        result++;
        Iterator<Integer> iter = graph[start].listIterator();
        while (iter.hasNext()) {
            int next = iter.next();
            if (!visited[next])
                dfs(next, graph, visited);
        }
    }
}