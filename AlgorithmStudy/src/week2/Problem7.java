package week2;

import java.util.*;

/**
 * 백준 3009번
 * 네 번째 점
 *
 */
public class Problem7 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        int x = 0; // 네 번째 점 x좌표
        int y = 0; // 네 번째 점 y좌표
        int[] xArr = new int[3]; // 세 점의 x좌표 저장 배열
        int[] yArr = new int[3]; // 세 점의 y좌표 저장 배열

        // 좌표 채우기
		for(int i=0 ; i<3 ; i++) {
            xArr[i]= input.nextInt();
            yArr[i]= input.nextInt();
        }
        
        // x좌표 구하기
        if(xArr[0] == xArr[1])
            x = xArr[2];
        else {
            if(xArr[0] == xArr[2])
                x = xArr[1];
            else
                x = xArr[0];
        }

        // y좌표 구하기
        if(yArr[0] == yArr[1])
            y = yArr[2];
        else {
            if(yArr[0] == yArr[2])
                y = yArr[1];
            else
                y = yArr[0];
        }

        System.out.println(x+" "+y);

		input.close();
	}

}