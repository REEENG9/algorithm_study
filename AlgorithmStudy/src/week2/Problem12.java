package week2;

import java.util.*;

/**
 * 백준 2581번
 * 소수
 * 분류 : 수학, 정수론, 소수 판정
 */
public class Problem12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> prime = new ArrayList<>();
        int M = input.nextInt(); // M 이상
        int N = input.nextInt(); // N 이하

        for(int i=M ; i<=N ; i++) {
            boolean isPrime = true;
            if(i <= 1)
                continue;
            for(int j=2 ; j<i ; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) {
                prime.add(i);
            }
        }

        if(prime.isEmpty())
            System.out.println(-1);
        else {
            int sum = 0;
            ListIterator<Integer> iter = prime.listIterator();
            while (iter.hasNext())
                sum += iter.next();
    
            System.out.println(sum);
            System.out.println(prime.get(0));
        }
        input.close();
    }
}
