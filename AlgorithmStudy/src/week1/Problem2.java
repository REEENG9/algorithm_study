package week1;

import java.util.*;

/**
 * 백준 11720번
 * 숫자의 합
 *
 */
public class Problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
        int n = input.nextInt();
        String s = input.next(); // 숫자를 문자열로 우선 입력 받음
        for(int i=0 ; i<n ; i++) {
            // char 데이터로 변환 후 아스키 코드 값으로 연산 (0의 아스키 코드는 48)
            sum += s.charAt(i) - 48; 
        }
        System.out.println(sum);
        input.close();
    }
}
