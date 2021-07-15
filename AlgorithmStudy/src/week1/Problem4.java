package week1;

import java.util.*;

/**
 * 백준 2775번
 * 부녀회장이 될테야
 *
 */
public class Problem4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int T = input.nextInt(); // 테스트 케이스 개수
        int k,n; // k층, n호 테스트 케이스 저장 변수
        int[][] apart = new int[15][15]; // 아파트 인원을 저장할 2차원 배열 선언
        
        // 0층 채우기 (i=1,2,3...)
        for(int i=0 ; i<apart[0].length ; i++) {
            apart[0][i] = i;
        }

        // 1층 ~ 14층 채우기
        for(int i=1 ; i<apart.length ; i++) {
            apart[i][0] = 0;
            for(int j=1 ; j<apart[i].length ; j++) {
                apart[i][j] = apart[i][j-1] + apart[i-1][j]; // k층 n호 인원 = (k층 n-1호 + k-1층 n호) 인원 
            }
        }

        // 인원 수가 채워진 2차원 배열 출력
        for(int i=0 ; i<T ; i++) {
            k = input.nextInt();
            n = input.nextInt();
            System.out.println(apart[k][n]);
        }
        input.close();
    }
}
