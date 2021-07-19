package week1;

import java.util.*;

/**
 * 백준 2869번
 * 달팽이는 올라가고 싶다
 *
 */
public class Problem6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int A = input.nextInt(); // 낮에 올라갈 수 있는 거리
        int B = input.nextInt(); // 밤에 미끄러지는 거리
        int V = input.nextInt(); // 나무 막대의 총 길이
        
        if((V-A) % (A-B) == 0)
            System.out.println((V-A)/(A-B)+1);

        // 나머지가 있을 경우, 남은 거리는 하루를 더 소비해야 하므로 +1
        else
            System.out.println((V-A)/(A-B)+2);
        
		input.close();
	}
}