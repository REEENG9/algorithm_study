import java.io.*;

/**
 * 문제이름 : 단어공부
 * 링크 : https://www.acmicpc.net/problem/1157
 * 알고리즘 분류
 * - 문자열
 * - 구현
 */

public class Baekjoon1157 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();   //모든 알파벳 대문자로 변경
        int[] alphabets = new int[26];  //알파벳 갯수를 저장할 배열
        
        for (int i = 0; i < str.length(); i++) 
            alphabets[str.charAt(i) - 65]++;    //알파벳 개수 카운트
        
        int max = 0;
        char maxChar = '?';

        for (int i = 0; i < alphabets.length; i++) {
            if(alphabets[i] > max) {
                max = alphabets[i];
                maxChar = (char)(i + 65);
            }
            else if(alphabets[i] == max) //최대값의 알파벳 개수가 중복되면
                maxChar = '?';
        }

        bw.write(maxChar+"\n");
        bw.flush();
    }
}
