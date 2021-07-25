package AlgorithmStudy.solution.week2;

import java.io.*;

/**
 * 문제이름 : 재귀함수가 뭔가요?
 * 링크 : https://www.acmicpc.net/problem/17478
 * 알고리즘 분류
 * - 재귀
 */

public class Baekjoon17478 {
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        System.out.println("어느 한 컴퓨터공학과 학생이 유명한 교수님을 찾아가 물었다.");
        recursion(0,n);
        
    }

    public static void recursion(int cur, int n) {
        System.out.println("____".repeat(cur)+"\"재귀함수가 뭔가요?\"");
        if(cur == n) 
            System.out.println("____".repeat(cur)+"\"재귀함수는 자기 자신을 호출하는 함수라네\"");
        else {
            System.out.println("____".repeat(cur)+"\"잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.");
            System.out.println("____".repeat(cur)+"마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.");
            System.out.println("____".repeat(cur)+"그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\"");
            recursion(cur+1, n);
        }
        System.out.println("____".repeat(cur)+"라고 답변하였지.");
    }

}

