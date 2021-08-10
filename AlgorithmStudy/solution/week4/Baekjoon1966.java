package AlgorithmStudy.solution.week4;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 문제이름 : 프린터 큐
 * 링크 : https://www.acmicpc.net/problem/1966
 * 알고리즘 분류
 * - 큐
 */

public class Baekjoon1966 {
    static int n, m;
    static int[] document;
    static int result;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            document = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) 
                document[i] = Integer.parseInt(st.nextToken());
            
            result = 0;
            print();
            bw.write(result+"\n");
        }
        bw.close();

    }

    public static void print() {
        Queue<Integer> iq = new LinkedList<>(); //중요도가 내림차순으로 담긴 큐
        Queue<Integer> q = new LinkedList<>();  //문서를 담는 큐
        Integer[] sortDocument = Arrays.stream(document).boxed().toArray(Integer[]::new);
        Arrays.sort(sortDocument,Collections.reverseOrder());

        for (int i = 0; i < n; i++) 
            iq.offer(sortDocument[i]);

        for (int i = 0; i < n; i++) 
            q.offer(i);
        
        int cnt = 0;
        int item = 0;
        while (!q.isEmpty()) {
            if (document[q.peek()] >= iq.peek()) {
                item = q.poll();
                iq.poll();
                cnt++;
                if (item == m) {
                    result = cnt;
                    return;
                }
            }
            else {
                item = q.poll();
                q.offer(item);
            }
        }
        
        
    }
}
