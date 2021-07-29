package AlgorithmStudy.solution.week3;

/**
 * 문제이름 : 실패율
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42889
 * 알고리즘 분류
 * - 구현
 */

public class Fail {
    public int[] solution(int N, int[] stages) {
        int[] answer = {};
        int[] stageArrival = new int[N];
        int[] stageClearFailed = new int[N+1];

        for (int i = 0; i < stages.length; i++) {
             int n = stages[i];
             stageClearFailed[n-1]++;
             for (int j = 0; j < n; j++) {
                 
             }
        }
        return answer;
    }

}
