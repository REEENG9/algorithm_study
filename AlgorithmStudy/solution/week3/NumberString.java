package AlgorithmStudy.solution.week3;

/**
 * 문제이름 : 숫자 문자열과 영단어
 * 링크 : https://programmers.co.kr/learn/courses/30/lessons/81301
 * 알고리즘 분류
 * - 구현
 */
public class NumberString {
    public int solution(String s) {
        String[] alphabet = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        StringBuilder sb = new StringBuilder();
        int idx = 0;
        while (idx < s.length()) {
            char c = s.charAt(idx);
            if (Character.isDigit(c)) { //숫자이면
                sb.append(c); 
                idx++;
            } else {    //알파벳이면
                String str = s.substring(idx, idx+3);   //세글자만 확인
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i].contains(str)) {    //세글자가 포함되면
                        sb.append(i);
                        idx += alphabet[i].length();
                    }
                }
            }
        }

        return Integer.parseInt(sb.toString());
    }
}
