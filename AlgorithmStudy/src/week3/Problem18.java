package week3;
import java.io.*;
/**
 * 백준 2447번
 * 별 찍기 - 10
 * 분류 : 분할 정복, 재귀
 */
public class Problem18 {
    static char[][] array; // 배열 선언
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        
        array = new char[N][N]; // 크기 n*n 
        for(int i=0 ; i<N ; i++) { // 배열 공백으로 초기화
            for (int j=0 ; j<N ; j++) {
                array[i][j] = ' ';
            }
        }

        star(N,0,0);

        for(int i=0 ; i<N ; i++) {
            for(int j=0 ; j<N ; j++) {
                bw.write(array[i][j]);
            }
            bw.write("\n");
        }

        bw.flush();
        bw.close();
    }

    public static void star(int n, int row, int col) {
        if(n == 3) {
            array[row][col] = '*';
            array[row][col+1] = '*';
            array[row][col+2] = '*';

            array[row+1][col] = '*';
            array[row+1][col+2] = '*';

            array[row+2][col] = '*';
            array[row+2][col+1] = '*';
            array[row+2][col+2] = '*';
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