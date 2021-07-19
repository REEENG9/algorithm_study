import java.io.*;

/**
 * 문제이름 : 그룹 단어 체커
 * 링크 : https://www.acmicpc.net/problem/1316
 * 알고리즘 분류
 * - 문자열
 * - 구현
 */

public class Baekjoon1316 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int[] alphabets = new int[26]; // 'a' = 97
            boolean isGroupWord = true; 
            String word = br.readLine();
            char prev = word.charAt(0);
            char curr;
            alphabets[prev-97]++;   //prev에 저장된 알파벳 카운트
            for (int j = 1; j < word.length(); j++) {
                curr = word.charAt(j);
                if(curr != prev) { //이전 알파벳과 다르면
                    if(alphabets[curr-97] > 0) { //이미 알파벳이 카운트되어 있으면
                        isGroupWord = false;
                        break;
                    }
                    alphabets[curr-97]++;
                }
                prev = curr;
            }
            if(isGroupWord)
                result++;
            
        }
        bw.write(result+"\n");
        bw.flush();
    }
}
