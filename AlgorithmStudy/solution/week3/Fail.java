package AlgorithmStudy.solution.week3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

/**
 * 문제이름 : 실패율
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42889
 * 알고리즘 분류
 * - 구현
 */

public class Fail {
    public int[] solution(int N, int[] stages) {
        int[] stageArrival = new int[N];    //스테이지에 도달한 플레이어 수
        int[] stageClearFailed = new int[N];  // 스테이지에 도달했으나 클리어 못한 플레이어 수
        ArrayList<float[]> result = new ArrayList<>();
        
        for (int i = 0; i < stages.length; i++) {
             int n = stages[i];
             stageClearFailed[n-1]++;
             for (int j = 0; j < n; j++) {
                if(j == N)
                    break; 
                stageArrival[j]++;
             }
        }

        for (int i = 0; i < N; i++) {
            result.add(new float[]{(float)stageClearFailed[i]/stageArrival[i],i+1});
        }

        result.sort(new Comparator<float[]>() {
            @Override
            public int compare(float[] f1, float[] f2) {
                if(f1[0] > f2[0])
                    return -1;
                else if(f1[0] < f2[0])
                    return 1;
                else {
                    if(f1[1] < f2[1])
                        return -1;
                    else if(f1[1] > f2[1])
                        return 1;
                    return 0;
                }
            }
        });

        int[] answer = new int[N];
        
        for (int i = 0; i < N; i++) {
            answer[i] = (int)result.get(i)[1];
        }
        
        return answer;
    }

}

class failStage {
    int stage;
    float failed;
}