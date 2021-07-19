package week1;

import java.util.*;

/**
 * 백준 1316번
 * 그룹 단어 체커
 *
 */
public class Problem5 {

	public static void main(String[] args) {
		    Scanner input = new Scanner(System.in);
		    int N = input.nextInt(); // 단어의 개수
        int count = 0; // 그룹 단어가 아닌 단어 개수
        int[] array; // 알파벳 저장 배열
        int prev = 0; // 이전 알파벳 저장

        for(int i=0 ; i<N ; i++) {
            array = new int[26];
            String s = input.next();
            for(int j=0 ; j<s.length() ; j++) {
                if(array[s.charAt(j)-97] == 0) { // 1. 처음 만나는 알파벳인 경우 : 배열 카운팅 후 알파벳 저장
                    array[s.charAt(j)-97] += 1;
                    prev = s.charAt(j)-97;
                }   
                else if(prev == s.charAt(j)-97) { // 2. 직전에 만난 알파벳인 경우 : 그룹 단어로 처리
                    continue;
                }               
                else if(array[s.charAt(j)-97] != 0) { // 3. 직전이 아닌 이전에 만난 알파벳인 경우 : 그룹 단어 아님, 변수 카운팅
                    count++;
                    break; // 이미 그룹 단어가 아님이 판명되었으므로 반복문 종료
                }
            }
        }
        System.out.println(N-count); // 전체 단어 개수 - 그룹 단어가 아닌 단어 개수 = 그룹 단어 개수
        input.close();
    }
}