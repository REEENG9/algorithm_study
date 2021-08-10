package AlgorithmStudy.solution.week5;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 문제이름 : 미로 탐색
 * 링크 : https://www.acmicpc.net/problem/2178
 * 알고리즘 분류
 * - 그래프 탐색
 * - 너비 우선 탐색
 */

public class Baekjoon2178 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] maze = new int[n][m];
        int[][] check = new int[n][m];
        String temp;
        for(int i=0;i<n;i++) {
            temp = br.readLine();
            for(int j=0;j<m;j++) {
                maze[i][j] = Character.getNumericValue(temp.charAt(j));
            }
        }

        Queue<int[]> q = new LinkedList<>();

        int[][] dir = {{-1,0},{1,0},{0,-1},{0,1}};  // 상 하 좌 우

        q.add(new int[] {0,0});
        int[] tmp;
        
        while(!q.isEmpty()) {
            tmp = q.poll();
            check[tmp[0]][tmp[1]] = 1;

            for(int i=0;i<dir.length;i++) {
                int row = tmp[0] + dir[i][0];
                int col = tmp[1] + dir[i][1];

                if(row < maze.length && col < maze[0].length && row >= 0 && col >= 0) {
                    if(maze[row][col] != 0 && check[row][col] == 0) {
                        q.add(new int[] {row,col});
                        check[row][col] = 1;
                        maze[row][col] = maze[tmp[0]][tmp[1]] + 1;
                    }
                }
            }
        }
        bw.write(maze[n-1][m-1]+"");
        bw.flush();
        bw.close();

    }
}
