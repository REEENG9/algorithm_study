package week4;

import java.io.*;
import java.util.*;

/**
 * 백준 9012번
 * 괄호
 * 분류 : 자료 구조, 문자열, 스택
 */
public class Problem21 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<Character> bracket = new Stack<>(); // 괄호 대칭 판별
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스
        
        for (int i = 0; i < T; i++) {
            String bk = br.readLine(); // 괄호 문자열 받기
            for (int j = 0; j < bk.length(); j++) { // 괄호 하나씩 받기
                char check = bk.charAt(j);
                if (check == '(' || check == ')' && (bracket.empty() || bracket.get(0) == ')'))
                    bracket.push(check);
                else {
                    bracket.pop();
                }
            }

            if(bracket.empty())
                bw.write("YES\n");
            else
                bw.write("NO\n");
                
            bracket.clear();
        }

        bw.flush();
        bw.close();
    }
}
