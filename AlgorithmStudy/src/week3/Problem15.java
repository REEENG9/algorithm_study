package week3;
import java.util.*;

/**
 * 프로그래머스 81301번
 * 숫자 문자열과 영단어
 * 
 */
public class Problem15 {
    public static void main(String[] args) {
        String str = "one4seveneight"; // 테스트 케이스 입력
        System.out.println(solution(str));
    }

    public static int solution(String s) {
        int answer = 0; // 반환값
        StringBuilder sb = new StringBuilder(); // 반환값 저장
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"}; // 각 문자 저장
        ArrayList<String> array = new ArrayList<>(Arrays.asList(arr)); // 리스트 전환
        
        while (!s.equals("")) {
            char c = s.charAt(0);
            if(48 <= c && c <= 57) { // 만난 문자가 숫자일때
                sb.append(s.substring(0,1));
                s = s.substring(1);
            }

            else { // 만난 문자가 알파벳일때
                for(int i=3 ; i<=5 ; i++) {
                    String str = s.substring(0,i);
                    if(array.indexOf(str) == -1)
                        continue;
                    else {
                        sb.append(array.indexOf(str));
                        s = s.substring(i);
                        break;
                    }
                }
            }
        }

        answer = Integer.parseInt(sb.toString());
        
        return answer;
    }
}
