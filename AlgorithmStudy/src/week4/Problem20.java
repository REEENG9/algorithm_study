package week4;
import java.io.*;
import java.util.*;
/**
 * 백준 10845번
 * 스택
 * 분류 : 자료 구조, 큐
 */
public class Problem20 {
    static ArrayList<Integer> queue; // 큐
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 명령 수
        queue = new ArrayList<>();
        
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

    public static void push(int item) {
        queue.add(item);
    }

    public static void pop() {
        if(queue.isEmpty())
            System.out.println(-1);
        else {
            System.out.println(queue.get(0));
            queue.remove(0);
        }
    }

    public static void size() {
        System.out.println(queue.size());
    }

    public static void empty() {
        if(queue.isEmpty())
            System.out.println(1);
        else
            System.out.println(0);
    }

    public static void front() {
        if(queue.isEmpty())
            System.out.println(-1);
        else
            System.out.println(queue.get(0));
    }

    public static void back() {
        if(queue.isEmpty())
            System.out.println(-1);
        else
            System.out.println(queue.get(queue.size()-1));
    }
}
