package AlgorithmStudy.solution.week2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제이름 : 네번째 점
 * 링크 : https://www.acmicpc.net/problem/3009
 * 알고리즘 분류
 * - 기하학
 * - 구현
 */

public class Baekjoon3009 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int[][] pos = new int[3][2];

        for (int i = 0; i < pos.length; i++) {
           st = new StringTokenizer(br.readLine());
           int x = Integer.parseInt(st.nextToken());
           int y = Integer.parseInt(st.nextToken());

           pos[i][0] = x;
           pos[i][1] = y;
        }
        int x ,y;
        if(pos[0][0] == pos[1][0]) 
            x = pos[2][0];
        else if(pos[0][0] == pos[2][0])
            x = pos[1][0];
        else 
            x = pos[0][0];

        if(pos[0][1] == pos[1][1]) 
            y = pos[2][1];
        else if(pos[0][1] == pos[2][1])
            y = pos[1][1];
        else 
            y = pos[0][1];
        
        bw.write(x+" "+y+"\n");
        bw.flush();
    }
}