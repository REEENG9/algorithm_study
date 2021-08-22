package week6;
import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;
/**
 * 백준 10866번
 * 덱
 * 분류 : 자료 구조, 덱
 */
public class Problem31 {
    static LinkedList<Integer> deque; // 덱
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령 수
        int item = 0;
        deque = new LinkedList<>();
        
        for (int i = 0 ; i < N ; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()); // 명령어 입력
            String command = st.nextToken();
            switch (command) {
                case "push_front":
                    item = Integer.parseInt(st.nextToken());
                    push_front(item);
                    break;
                case "push_back":
                    item = Integer.parseInt(st.nextToken());
                    push_back(item);
                    break;
                case "pop_front":
                    pop_front();
                    break;
                case "pop_back":
                    pop_back();
                    break;
                case "size":
                    size();
                    break;
                case "empty":
                    empty();
                    break;
                case "front":
                    front();
                    break;
                case "back":
                    back();
                    break;
                default:
                    break;
            }
        }
    }

    // 정수 item을 덱의 앞에 넣는다.
    public static void push_front(int item) {
        deque.addFirst(item);
    }
    // 정수 item을 덱의 뒤에 넣는다.
    public static void push_back(int item) {
        deque.addLast(item);
    }
    // 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다.
    // 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static void pop_front() {
        if(deque.isEmpty())
            System.out.println(-1);
        else {
            System.out.println(deque.get(0));
            deque.removeFirst();
        }
    }
    // 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다.
    // 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static void pop_back() {
        if(deque.isEmpty())
            System.out.println(-1);
        else {
            System.out.println(deque.get(deque.size()-1));
            deque.removeLast();
        }
    }
    // 덱에 들어있는 정수의 개수를 출력한다.
    public static void size() {
        System.out.println(deque.size());
    }
    // 덱이 비어있으면 1을, 아니면 0을 출력한다.
    public static void empty() {
        if(deque.isEmpty())
            System.out.println(1);
        else
            System.out.println(0);
    }
    // 덱의 가장 앞에 있는 정수를 출력한다.
    // 만약 덱이 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static void front() {
        if(deque.isEmpty())
            System.out.println(-1);
        else
            System.out.println(deque.get(0));
    }
    // 덱의 가장 뒤에 있는 정수를 출력한다.
    // 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
    public static void back() {
        if(deque.isEmpty())
            System.out.println(-1);
        else
            System.out.println(deque.get(deque.size()-1));
    }
}
