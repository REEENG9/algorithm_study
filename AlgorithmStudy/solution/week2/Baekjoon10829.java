package AlgorithmStudy.solution.week2;

import java.io.*;

/**
 * 문제이름 : 이진수 변환
 * 링크 : https://www.acmicpc.net/problem/10829
 * 알고리즘 분류
 * - 수학
 * - 구현
 * - 재귀
 */

public class Baekjoon10829 {
    public static StringBuilder sb;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long n = Long.parseLong(br.readLine());
        sb = new StringBuilder();
        binary(n);
        bw.write(sb.reverse().toString());
        bw.flush();
    }

    public static void binary(long n) {
        long result = n/2;
        sb.append(n%2);
        if(result > 0) {   
            binary(result);
        }
    }
}
