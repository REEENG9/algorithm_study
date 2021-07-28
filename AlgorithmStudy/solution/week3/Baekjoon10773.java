package AlgorithmStudy.solution.week3;

import java.io.*;
import java.util.Stack;

/**
 * 문제이름 : 제로
 * 링크 : https://www.acmicpc.net/problem/10773
 * 알고리즘 분류
 * - 자료구조
 * - 스택
 * - 문자열
 */

public class Baekjoon10773 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> s = new Stack<>();
        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < k; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n == 0) {
                sum -= s.pop();
            } else {
                sum += n;
                s.push(n);
            }
        }
        bw.write(sum+"\n");
        bw.flush();

    }

}
