package AlgorithmStudy.solution.week2;

import java.io.*;

/**
 * 문제이름 : 팩토리얼
 * 링크 : https://www.acmicpc.net/problem/10872
 * 알고리즘 분류
 * - 수학
 * - 구현
 */

public class Baekjoon10872 {
    public static StringBuilder sb;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        bw.write(factorial(n)+"\n");
        bw.flush();

    }

    public static int factorial(int n) {
        int result = 1;
        for (int i = n; i > 0; i--) 
            result *= i;
        
        return result;
    }
}

