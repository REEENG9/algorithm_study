package week4;
import java.io.*;
import java.util.*;

/**
 * 백준 1966번
 * 프린터 큐
 * 분류 : 구현, 자료 구조, 시뮬레이션, 큐
 */
public class Problem23 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 개수
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken()); // 문서 개수
            int M = Integer.parseInt(st.nextToken()); // 알고자 하는 문서의 큐 순서

            st = new StringTokenizer(br.readLine()); // 중요도 입력
            Queue<int[]> print = new LinkedList<>();
            int[] item; // 인덱스 & 중요도 저장 배열

            for (int j = 0; j < N; j++) {
                item = new int[2];
                int imp = Integer.parseInt(st.nextToken()); 
                item[0] = j;
                item[1] = imp;
                print.add(item);
            }

            Iterator<int[]> iter;
            int output = 0; // 출력 순서 카운트
            boolean max; 
            int[] check = new int[2]; // 중요도 비교 체크
            item = new int[2]; // 배열 초기화 (재활용)
            while (!print.isEmpty()) {
                max = true;
                iter = print.iterator(); // 포인터 초기화
                item = iter.next(); // 큐의 맨 앞 문서
                for (int j = 0; j < print.size()-1; j++) {
                    check = iter.next(); // 비교할 문서
                    if (check[1] > item[1]) { // 중요도가 더 높은 문서가 발견되면 큐 재정렬
                        print.remove();
                        print.add(item);
                        max = false;
                        break;
                    }
                }
                    
                if (!max) // 중요도가 높은 문서가 발견됐을때 무시
                    continue;
                else if (max && item[0] == M) { // 출력한 문서가 알고자 했던 문서라면 정지
                    output++;
                    bw.write(output + "\n");
                    bw.flush();
                    break;
                }
                else { // 중요도 높은 문서 없으면 큐에서 제거
                    print.remove();
                    output++;
                }
            }
        }
        

        
        bw.close();
    }
}
