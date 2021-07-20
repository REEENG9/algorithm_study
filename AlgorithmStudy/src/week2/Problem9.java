package week2;

import java.util.*;

/**
 * 백준 10829번
 * 이진수 변환
 * 분류 : 수학, 구현, 재귀
 */
public class Problem9 {
    static StringBuilder sb = new StringBuilder(); // 이진수 저장
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        long N = input.nextLong(); // 테스트 케이스의 최대값이 100,000,000,000,000 이므로 long 타입 선언

        BinaryTrans(N);
        System.out.println(sb.reverse().toString()); // StringBuilder에 거꾸로 저장되므로 reverse

		input.close();
	}
    /**
     * 재귀를 통해 주어진 정수 n을 이진수로 변환하여 StringBuilder에 저장한다
     * @param n
     */
    public static int BinaryTrans(long n) {
        if(n == 1) { // 종료조건
            sb.append(1);
            return 1;
        }
        else {
            sb.append(n%2);
            return BinaryTrans(n/2);
        }
    }
}