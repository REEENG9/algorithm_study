package week4;
import java.util.*;
import java.io.*;

/**
 * 백준 5397번
 * 키로거
 * 분류 : 자료 구조, 스택, 연결 리스트
 */
public class Problem24 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        for (int i = 0; i < T; i++) {
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();

            String password = br.readLine();
            for (int j = 0; j < password.length(); j++) {
                char c = password.charAt(j);

                if (Character.isAlphabetic(c) || Character.isDigit(c)) // 1. 문자
                    iter.add(c);
                
                else if (c == '<' && iter.hasPrevious() && !list.isEmpty()) // 2. 좌방향
                    iter.previous();

                else if (c == '>' && iter.hasNext() && !list.isEmpty()) // 3. 우방향
                    iter.next();

                else if (c == '-' && iter.hasPrevious() && !list.isEmpty()) { // 4. 백스페이스
                    iter.previous();
                    iter.remove();
                }
            }

            for (Character c : list)
                bw.write(c);
            bw.write("\n");
        }

        
        bw.flush();
        bw.close();
    }
}