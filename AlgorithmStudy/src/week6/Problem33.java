package week6;
import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;
/**
 * 백준 5430번
 * AC
 * 분류 : 구현, 자료 구조, 문자열, 파싱, 덱
 */
public class Problem33 {
    static BufferedWriter bw;
    static boolean error; // 에러 판별
    static boolean reverse; // 리버스 판별
    static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> list = new ArrayDeque<>();
        StringTokenizer st;
        String command, number;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            error = false;
            reverse = false;
            command = br.readLine(); // 명령어 p
            n = Integer.parseInt(br.readLine()); // 배열 내 숫자 개수
            number = br.readLine(); // 배열 입력
            
            if (number != "[]") { // 빈 배열이 아닐 경우에만 숫자 파싱
                number = number.substring(1, number.length()-1); // 대괄호 자르기
                st = new StringTokenizer(number, ",");
                for (int j = 0; j < n; j++)
                    list.add(Integer.parseInt(st.nextToken()));
            }
            
            for (int k = 0; k < command.length(); k++) {
                char c = command.charAt(k);
                switch (c) {
                    case 'R': // 뒤집기
                        R(list);
                        break;
                    case 'D': // 버리기
                        D(list);
                        break;
                    default:
                        break;
                }
            }
            
            if (!error && !reverse) { // 1. 뒤집어지지 않은 경우
                bw.write("[");
                while (!list.isEmpty()) {
                    bw.write(list.pop()+"");
                    if (!list.isEmpty())
                        bw.write(",");
                }
                bw.write("]");
            }
            
            if (!error && reverse) { // 2. 뒤집힌 경우
                bw.write("[");
                while (!list.isEmpty()) {
                    bw.write(list.getLast()+"");
                    list.removeLast();
                    if (!list.isEmpty())
                        bw.write(",");
                }
                bw.write("]");
            }

            if (error) // 3. 함수 내부에서 에러가 걸린 경우
                bw.write("error");
        
        bw.newLine();
        }
        bw.flush();
        bw.close();
    }
    
    // 배열에 있는 숫자의 순서를 뒤집는다
    public static void R(Deque<Integer> list) {
        if (!reverse)
            reverse = true;
        else
            reverse = false;
    }

    // 배열의 첫번째 숫자를 제거한다
    public static void D(Deque<Integer> list) {
        if (list.isEmpty()) {
            error = true;
            return;
        }
        if (reverse)
            list.removeLast();
        else
            list.removeFirst();
    }
}