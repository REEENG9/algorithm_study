package AlgorithmStudy.solution.week3;

import java.io.*;

/**
 * 문제이름 : 별찍기10
 * 링크 : https://www.acmicpc.net/problem/2447
 * 알고리즘 분류
 * - 재귀
 * - 분할정복
 */

public class Baekjoon2447 {
    public static char[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        
        arr = new char[n][n];
        //배열 공백으로 초기화
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
            arr[i][j] = ' ';
            }
        }
        
        star(n,0,0);
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                bw.write(arr[i][j]);
            }
            bw.write("\n");
        }
        bw.flush();
    }

    public static void star(int n, int row, int col) {
        if(n == 3) {
            arr[row][col] = '*';
            arr[row][col+1] = '*';
            arr[row][col+2] = '*';

            arr[row+1][col] = '*';
            arr[row+1][col+2] = '*';

            arr[row+2][col] = '*';
            arr[row+2][col+1] = '*';
            arr[row+2][col+2] = '*';
        }
        else {
            star(n/3,row,col);
            star(n/3,row,col+(n/3));
            star(n/3,row,col+2*(n/3));

            star(n/3,row+(n/3),col);
            star(n/3,row+(n/3),col+2*(n/3));
            
            star(n/3,row+2*(n/3),col);
            star(n/3,row+2*(n/3),col+(n/3));
            star(n/3,row+2*(n/3),col+2*(n/3));
        }
    }
}