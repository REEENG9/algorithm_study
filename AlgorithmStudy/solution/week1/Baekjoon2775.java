package AlgorithmStudy.solution.week1;

import java.io.*;

/**
 * 문제이름 : 부녀회장이 될테야
 * 링크 : https://www.acmicpc.net/problem/2775
 * 알고리즘 분류
 * - 문자열
 * - 구현
 */

public class Baekjoon2775 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] apart = new int[15][14];
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < apart[0].length; i++) //0층 인원 채워줌
            apart[0][i] = i + 1;

        for (int i = 0; i < apart.length; i++) // 각층 1호 인원 채워줌
            apart[i][0] = 1;
        
        for (int i = 1; i < apart.length; i++) //나머지 호실 계산
            for (int j = 1; j < apart[i].length; j++) 
                apart[i][j] = apart[i][j-1] + apart[i-1][j];
        
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            bw.write(apart[k][n-1]+"\n");
        }
        bw.flush();
    }
}