package AlgorithmStudy.solution.week3;

import java.util.Stack;

/**
 * 문제이름 : 크레인 인형뽑기 게임
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/42889
 * 알고리즘 분류
 * - 구현
 */

public class ClawMachineGame {
    public static void main(String[] args) {
        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};
        ClawMachineGame c = new ClawMachineGame();
        System.out.println(c.solution(board, moves));


    }

    public int solution(int[][] board, int[] moves) {
        int answer = 0;

        Stack<Integer> basket = new Stack<>();
        Stack<Integer>[] s = new Stack[board.length];
        for (int i = 0; i < s.length; i++) 
            s[i] = new Stack<>();

        for (int i = board.length-1; i >= 0; i--) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] != 0)
                    s[j].push(board[i][j]);
            }
        }
        
        for (int i = 0; i < moves.length; i++) {
            int n = moves[i] - 1;
            if(s[n].isEmpty())
                continue;
            int item = s[n].pop();
            if(!basket.isEmpty()) {
                if (item == basket.peek()) {
                    answer += 2;
                    basket.pop();
                } else {
                    basket.push(item);
                }
            } else {
                basket.push(item);
            }
        }

        return answer;
    }
}
