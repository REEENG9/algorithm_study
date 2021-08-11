package AlgorithmStudy.solution.week4;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * 문제이름 : 괄호
 * 링크 : https://www.acmicpc.net/problem/9012
 */

public class Baekjoon9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int tc = Integer.parseInt(br.readLine());
        for (int t = 0; t < tc; t++) {
            String str = br.readLine();
            if (vps(str)) 
                bw.write("YES");
            else
                bw.write("NO");
            bw.newLine();
        }
        bw.close();
    }

    public static boolean vps(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(')
                s.push(c);
            else {    // 닫는 괄호일 경우
                if (s.isEmpty()) 
                    return false;
                else 
                    s.pop();
            }
        }
        if (!s.isEmpty()) 
            return false;
        

        return true;
    }
}


/*


*/
