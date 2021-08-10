package AlgorithmStudy.solution.week4;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제이름 : 스택
 * 링크 : https://www.acmicpc.net/problem/10828
 * 알고리즘 분류
 * - 스택
 */

public class Baekjoon10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack s = new Stack();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer cmd;
        int temp;
        for(int i=0;i<n;i++) {
            cmd = new StringTokenizer(br.readLine());
            switch(cmd.nextToken()) {
                case "push":
                    s.push(Integer.parseInt(cmd.nextToken()));
                    break;
                case "pop":
                    bw.write(s.pop()+"\n");
                    break;
                case "size":
                    bw.write(s.getSize()+"\n");
                    break;
                case "empty":
                    bw.write((s.isEmpty()?"1":"0")+"\n");
                    break;
                case "top":
                    bw.write(s.getTop()+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

class Stack {
    private class Node {
        int item;
        Node next;

        private Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node top = null;
    private int size;

    public boolean isEmpty() {
        return top == null;
    }

    public int getSize() {
        return size;
    }

    public int getTop() {
        if(!isEmpty())
            return top.item;
        else
            return -1;
    }

    public void push(int item) {
        Node node = new Node(item);
        node.next = top;
        top = node;
        size++;
    }

    public int pop() {
        if(!isEmpty()) {
            int item = top.item;
            top = top.next;
            size--;
            return item;
        }
        else
            return -1;
    }
}
