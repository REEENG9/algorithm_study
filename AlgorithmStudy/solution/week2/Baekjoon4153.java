package AlgorithmStudy.solution.week2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 문제이름 : 직각삼각형
 * 링크 : https://www.acmicpc.net/problem/4153
 * 알고리즘 분류
 * - 기하학
 * - 수학
 */

public class Baekjoon4153 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        arr[0] = Integer.parseInt(st.nextToken());
        arr[1] = Integer.parseInt(st.nextToken());
        arr[2] = Integer.parseInt(st.nextToken());

        while(arr[0] != 0) {
            Arrays.sort(arr);
            if((int)Math.pow(arr[2], 2) == (int)Math.pow(arr[0], 2) + (int)Math.pow(arr[1], 2)) 
                bw.write("right\n");
            else
                bw.write("wrong\n");
        
            st = new StringTokenizer(br.readLine());
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());
        }
        bw.flush();
    }
}