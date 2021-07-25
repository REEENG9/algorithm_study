package AlgorithmStudy.solution.week2;

import java.io.*;

/**
 * 문제이름 : 소수
 * 링크 : https://www.acmicpc.net/problem/2581
 * 알고리즘 분류
 * - 수학
 * - 소수판정
 */

public class Baekjoon2581 {

    public static int[] numbers;
    public static int sum;
    public static int min;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        sum = 0;
        min = Integer.MAX_VALUE;
        numbers = new int[n+1];
        for (int i = 2; i <= n; i++) 
            numbers[i] = i;
        
        primeNumberCount(m, n);

        if(sum != 0)
            bw.write(sum+"\n"+min+"\n");
        else
            bw.write(-1+"\n");
        bw.flush();
    }

    public static void primeNumberCount(int m, int n) {
        for(int i = 2; i <= n; i++) {
            if(numbers[i] == 0) //0이면 넘김
                continue;

            for (int j = i*2; j <= n; j += i) { //i의 2번째 배수부터 차례대로 제거
                if(numbers[j] == 0)
                    continue;
                numbers[j] = 0;
            }
        }

        for (int i = m; i <= n; i++) {
            if(numbers[i] == 0)
                continue;
            
            if(numbers[i] < min)
                min = numbers[i];

            sum += numbers[i];
        }
    }

    
}