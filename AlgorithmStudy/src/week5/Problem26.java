package week5;
import java.io.*;

/**
 * 백준 2448번
 * 별 찍기 - 11
 * 분류 : 재귀
 */
public class Problem26 {
    static char[][] array;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        array = new char[N][2*N];
        star(N,0,0);
        for (char[] c  : array) {
            for (char c8 : c) {
                if(c8 == '\u0000')
                    bw.write(" ");
                else
                    bw.write(c8+"");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }

    public static void star(int n, int r, int c) {
        if (n == 3) {
            array[r][c+2] = '*';
            array[r+1][c+1] = '*';
            array[r+1][c+3] = '*';
            array[r+2][c] = '*';
            array[r+2][c+1] = '*';
            array[r+2][c+2] = '*';
            array[r+2][c+3] = '*';
            array[r+2][c+4] = '*';
        }
        else {
            star(n/2, r, c+n/2);
            star(n/2, r+n/2, c);
            star(n/2, r+n/2, c+n);
        }
    }
}
