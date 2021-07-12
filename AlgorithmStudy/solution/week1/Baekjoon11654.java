import java.io.*;

/**
 * 문제이름 : 아스키코드
 * 링크 : https://www.acmicpc.net/problem/11654
 * 알고리즘 분류
 * - 구현
 */
public class Baekjoon11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int c = br.readLine().charAt(0); //char형(아스키코드)은 10진수로 표현하면 해당하는 숫자로 변환 

        bw.write(c+"\n");
        bw.flush();
    }
    
}
