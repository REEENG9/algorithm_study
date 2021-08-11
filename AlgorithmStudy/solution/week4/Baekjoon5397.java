package AlgorithmStudy.solution.week4;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * 문제이름 : 키로거
 * 링크 : https://www.acmicpc.net/problem/5397
 * 알고리즘 분류
 * - 스택
 * - 연결리스트
 */

public class Baekjoon5397 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        LinkedList<String> password;
        ListIterator<String> cursor;
        String[] keyLog;

        for(int i=0;i<n;i++) {
            keyLog  = br.readLine().split("");
            password = new LinkedList<String>();
            cursor = password.listIterator();
            for(int j=0;j< keyLog.length;j++) {
                switch (keyLog[j]) {
                    case "<":
                        if(cursor.hasPrevious())
                            cursor.previous();
                        break;

                    case ">":
                        if(cursor.hasNext())
                            cursor.next();
                        break;

                    case "-":
                        if(cursor.hasPrevious()) {
                            cursor.previous();
                            cursor.remove();
                        }
                        break;

                    default:
                        cursor.add(keyLog[j]);
                }
            }
            for(String s : password)
                bw.write(s);
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
