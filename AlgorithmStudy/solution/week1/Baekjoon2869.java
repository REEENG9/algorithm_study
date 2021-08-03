package AlgorithmStudy.solution.week1;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제이름 : 달팽이는 올라가고 싶다
 * 링크 : https://www.acmicpc.net/problem/2869
 * 알고리즘 분류
 * - 수학
 */

public class Baekjoon2869 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int oneDayLen = A - B; //하루에 올라갈 수 있는 길이(마지막 날 전까지)
        int lastPrevLen = V - A;   //마지막 날 전까지 올라가야하는 길이
        
        int lastPrevDay = lastPrevLen/oneDayLen;    //마지막 날 전까지 소비되는 일수
        if(lastPrevLen%oneDayLen > 0)   //만약 나머지가 있으면
            lastPrevDay++;  //하루추가
        
        lastPrevDay++;  //마지막 날 추가
        bw.write(lastPrevDay+"\n");
        bw.flush();
    }
}
