package week3;

import java.util.*;

/**
 * 백준 10773번
 * 제로
 * 분류 : 구현, 자료 구조, 문자열, 스택
 */

 public class Problem13 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int k = input.nextInt(); // 테스트 케이스 개수
        int num;
        int sum = 0;
        for(int i=0 ; i<k ; i++) {
            num = input.nextInt();
            if(num == 0) // 0을 부를시 최근 숫자를 지운다 (stack에서 pop)
                stack.pop();
            else // 0이 아닌 수면 해당 숫자를 쓴다 (stack에서 push)
                stack.push(num);
        } 

        while (!stack.empty()) { // stack에서 남은 수들을 빼면서 합산
            sum += stack.peek(); 
            stack.pop();
        }

        System.out.println(sum);

        input.close();
     }
 }