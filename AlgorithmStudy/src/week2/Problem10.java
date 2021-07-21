package week2;

import java.util.*;

/**
 * 백준 10872번
 * 팩토리얼
 * 분류 : 수학, 구현
 */
public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); // 테스트 케이스 입력
        System.out.println(factorial(N));
        input.close();
    }
    /**
     * 재귀를 통해 주어진 정수 n의 팩토리얼 n!을 구한다
     * @param n
     */
    public static int factorial(int n) {
        if(n <= 1)
            return 1;
        else
            return n * factorial(n-1);

    }
}
