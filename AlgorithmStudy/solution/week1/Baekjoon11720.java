package AlgorithmStudy.solution.week1;

import java.io.*;

/**
 * 문제이름 : 숫자의 합
 * 링크 : https://www.acmicpc.net/problem/11720
 * 알고리즘 분류
 * - 수학
 * - 문자열
 * - 사칙연산
 */

public class Baekjoon11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String num = br.readLine();

        int result = 0;
        for (int i = 0; i < n; i++) 
            result += num.charAt(i)-48; //아스키코드에서 숫자는 48번부터 시작

        bw.write(result+"\n");
        bw.flush();
    }
}
