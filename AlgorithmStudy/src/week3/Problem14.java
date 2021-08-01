package week3;
import java.util.*;

/**
 * 프로그래머스 42889번
 * 실패율
 * 
 */
public class Problem14 {
    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        System.out.println(Arrays.toString(solution(N, stages)));
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] reach = new int[N]; // 도달 인원
        int[] stop = new int[N+1]; // 멈춘 인원
        ArrayList<failureRate> failure = new ArrayList<>(); // 실패율 저장 (실패율 + 스테이지)

        for(int i=0 ; i<stages.length ; i++) { // 인원 수 만큼 반복
            int n = stages[i];
            stop[n-1]++; // 멈춘 인원 측정
            for (int j=0; j<n; j++) { // 도달 인원 카운트
                if(j == N)
                    break;
                reach[j]++;
            }
        }

        for (int j=0; j<N; j++) { // 리스트에 스테이지 별 실패율 입력
            failure.add(new failureRate(j+1, (float)stop[j]/reach[j]));
        }

        failure.sort(new Comparator<failureRate>() { // 실패율 내림차순 정렬
            @Override
            public int compare(failureRate f1, failureRate f2) {
                if(f1.getFail() > f2.getFail())
                    return -1;
                else if(f1.getFail() < f2.getFail())
                    return 1;
                else {
                    if(f1.getStage() < f2.getStage())
                        return -1;
                    else if(f1.getStage() > f2.getStage())
                        return 1;
                    return 0;
                }
            }
        });

        for (int i=0 ; i<N ; i++) {
            answer[i] = failure.get(i).getStage();
        }

        return answer;
    }
}

class failureRate {
    private int stage;
    private float fail; 

    public failureRate(int stage, float fail) {
        this.setStage(stage);
        this.setFail(fail);
    }

    public int getStage() {
        return stage;
    }
    public void setStage(int n) {
        this.stage = n;
    }
    public float getFail() {
        return fail;
    }
    public void setFail(float f) {
        this.fail = f;
    }
}