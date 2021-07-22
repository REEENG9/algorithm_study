package week2;

import java.util.*;
/**
 * 백준 17478번
 * 재귀함수가 뭔가요?
 * 분류 : 재귀
 */
public class Problem11 {
    static StringBuilder sb = new StringBuilder(); // 언더바 저장
    static String str1 = "\"재귀함수가 뭔가요?\"";
    static String str2 = "\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.";
    static String str3 = "마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.";
    static String str4 = "그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"";
    static String str5 = "\"재귀함수는 자기 자신을 호출하는 함수라네\"";
    static String str6 = "라고 답변하였지.\n";
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        System.out.println(recursive(N));

        input.close();
    }
    
    public static String recursive(int n) {
        if(n == 0) {
            System.out.print(sb.toString());
            System.out.println(str1);
            System.out.print(sb.toString());
            System.out.println(str5);
            return (sb.toString()) + str6;
        }
        else {
            System.out.print(sb.toString());
            System.out.println(str1);
            System.out.print(sb.toString());
            System.out.println(str2);
            System.out.print(sb.toString());
            System.out.println(str3);
            System.out.print(sb.toString());
            System.out.println(str4);
            sb.append("____");
            return recursive(n-1) + (sb.delete(0,4).toString()) + str6; // 메소드를 끝내면서 언더바가 4개씩 줄어들어야함
        }
    }
}