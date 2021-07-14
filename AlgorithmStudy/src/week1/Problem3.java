package week1;

import java.util.*;

/**
 * 백준 1157번
 * 단어 공부
 *
 */
public class Problem3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.next();
        int[] array = new int[27]; // 알파벳 개수 저장 배열
        int max = 0; // 배열 내 최대값 저장 변수
        int index = 0; // 최대값을 가진 인덱스 저장 변수
        int index2 = 26; // 중복값 인덱스 저장 변수 

        s = s.toUpperCase();

        // 알파벳 카운트
        for(int i=0 ; i<s.length() ; i++)
            array[s.charAt(i)-65] += 1;
            
        // 최대 카운트 찾기
        for(int i=0 ; i<array.length ; i++) {
            if(array[i] == 0) // 나오지 않은 알파벳 건너뜀
                continue;
            if(array[i] > max) { // 1. 최대값 발견 : max값 초기화
                max = array[i];
                index = i;
            } 
            else if(array[i] == max) // 2. 중복된 값 발견 : 추후 판별을 위해 인덱스 값 따로 저장
                index2 = i;
        }

        if(array[index] != array[index2]) { // 
            char c = (char)(index+65);
            System.out.println(c);
        }
        else
            System.out.println("?");
        input.close();
    }
}
