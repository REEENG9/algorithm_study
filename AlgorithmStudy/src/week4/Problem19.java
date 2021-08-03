package week4;
import java.io.*;
import java.util.*;
/**
 * 백준 10828번
 * 스택
 * 분류 : 자료 구조, 스택
 */
public class Problem19 {
    static ArrayList<Integer> stack; // 스택
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine()); // 명령 수
        stack = new ArrayList<>();
        
        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 명령어 입력
            String command = st.nextToken();
            switch (command) {
                case "push":
                    int item = Integer.parseInt(st.nextToken());
                    push(item);
                    break;
                case "pop":
                    pop();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "top":
                    top();
                    break;
                default:
                    break;
            }
        }

        bw.flush();
        bw.close();
    }

    public static void push(int item) {
        stack.add(item);
    }

    public static void pop() {
        if(stack.isEmpty())
            System.out.println(-1);
        else {
            System.out.println(stack.get(stack.size()-1));
            stack.remove(stack.size()-1);
        }
    }

    public static void size() {
        System.out.println(stack.size());
    }

    public static void empty() {
        if(stack.isEmpty())
            System.out.println(1);
        else
            System.out.println(0);
    }

    public static void top() {
        if(stack.isEmpty())
            System.out.println(-1);
        else
            System.out.println(stack.get(stack.size()-1));
    }
}
