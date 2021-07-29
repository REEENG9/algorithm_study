package week3;
import java.util.*;

/**
 * 프로그래머스 64061번
 * 크레인 인형뽑기 게임
 * 
 */
public class Problem16 {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        System.out.println(solution(board, moves));
    }

    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>(); // 바구니
        basket.push(0); // 초기 peek 연산을 위해 값 넣기

        // moves 크기 만큼 인형뽑기 시도
        for (int i=0 ; i<moves.length ; i++) {
            // 인형을 만날 때까지 board의 세로 길이 만큼 탐색
            for(int j=0 ; j<board.length ; j++) {
                // 1. 크레인이 내려오면서 0인지 확인
                if(board[j][moves[i]-1] == 0)
                    continue;

                // 2. 크레인이 만난 인형이 바구니 최상단 인형과 같을 때
                else if(board[j][moves[i]-1] == basket.peek()) { 
                    basket.pop(); // 인형을 넣지 않고 바로 stack 에서 pop
                    board[j][moves[i]-1] = 0; // 인형이 뽑힌 자리이므로 0으로 초기화
                    answer += 2; // 인형 두 개가 터짐
                    break;
                }
                
                // 3. 크레인이 다른 인형을 만났을 때
                else {
                    basket.push(board[j][moves[i]-1]); // 바구니에 추가
                    board[j][moves[i]-1] = 0; // 인형이 뽑힌 자리이므로 0으로 초기화
                    break;
                }
            }
        }
        return answer;
    }
}
