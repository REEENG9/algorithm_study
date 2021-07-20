package week2;

import java.util.*;

/**
 * 백준 10829번
 * 이진수 변환
 * 분류 : 수학, 구현, 재귀
 */
public class Problem9 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int N = input.nextInt();

        BinaryTrans(N);

		input.close();
	}

    public static int BinaryTrans(int n) {
        if(n == 1) {
            System.out.print(1);
            return 1;
        }
        else {
            System.out.print(n%2);
            return BinaryTrans(n/2);
        }
    }
}