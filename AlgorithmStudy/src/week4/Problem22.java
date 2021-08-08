package week4;
import java.io.*;
import java.util.*;

/**
 * 백준 1158번
 * 요세푸스 문제
 * 분류 : 자료 구조, 큐
 */
public class Problem22 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 숫자 범위
        int K = Integer.parseInt(st.nextToken()); // 삭제할 인덱스
        Queue<Integer> queue = new LinkedList<>(); // 숫자를 저장할 큐
        int[] result = new int[N]; // 요세푸스 순열을 저장할 배열
        
        for (int i = 0; i < N; i++) // 1~N 채우기
            queue.add(i+1);
        
        Iterator<Integer> iter = queue.iterator();
        int idx = 0;
        while (!queue.isEmpty()) {
            int check = 0;
            for (int i = 0; i < K; i++) { // K만큼 포인터 이동
                if(!iter.hasNext()) // 포인터가 큐의 마지막일 경우 이터레이터 초기화
                    iter = queue.iterator();
                check = iter.next(); // K에 해당하는 수를 저장
            }
            result[idx] = check; // 배열에 저장
            iter.remove(); // 큐에서 해당 숫자 삭제
            idx++;
        }
        bw.write("<");
        for (int i = 0; i < result.length; i++) {
            bw.write(result[i]+"");
            if (i == result.length-1)
                break;
            bw.write(", ");
        }
        bw.write(">");

        bw.flush();
        bw.close();
        
    }
}
