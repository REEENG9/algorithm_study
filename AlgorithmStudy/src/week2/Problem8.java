package week2;

import java.util.*;

/**
 * 백준 4153번
 * 직각삼각형
 * 분류 : 수학, 기하학
 */
public class Problem8 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int[] array = new int[3]; // 세 변의 길이 저장

        // 0 0 0이 입력될 때까지 반복
        while (true) {
            for(int i=0 ; i<3 ; i++)
                array[i] = input.nextInt();
                
            Arrays.sort(array); // 배열을 오름차순으로 정렬

            if(array[0] == 0) // 종료 조건
                break;
            
            // 피타고라스 정리 사용
            int x = (int)Math.pow(array[0], 2);
            int y = (int)Math.pow(array[1], 2);
            int z = (int)Math.pow(array[2], 2);
            if(x + y == z)
                System.out.println("right");
            else
                System.out.println("wrong");
        }
		input.close();
	}
}