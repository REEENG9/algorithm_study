package AlgorithmStudy.solution.week4;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제이름 : 큐
 * 링크 : https://www.acmicpc.net/problem/10845
 * 알고리즘 분류
 * - 큐
 */

public class Baekjoon10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Queue q = new Queue();

        int n = Integer.parseInt(br.readLine());
        StringTokenizer cmd;
        int temp;
        for(int i=0;i<n;i++) {
            cmd = new StringTokenizer(br.readLine());
            switch(cmd.nextToken()) {
                case "push":
                    q.push(Integer.parseInt(cmd.nextToken()));
                    break;
                case "pop":
                    bw.write(q.pop()+"\n");
                    break;
                case "size":
                    bw.write(q.getSize()+"\n");
                    break;
                case "empty":
                    bw.write((q.isEmpty()?"1":"0")+"\n");
                    break;
                case "front":
                    bw.write(q.getFront()+"\n");
                    break;
                case "back":
                    bw.write(q.getBack()+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}

class Queue {
    private class Node {
        int item;
        Node next;

        private Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node front = null;
    private Node back = null;
    private int size;

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int getFront() {
        if(!isEmpty())
            return front.item;
        else
            return -1;
    }

    public int getBack() {
        if(!isEmpty())
            return back.item;
        else
            return -1;
    }

    public void push(int item) {
        Node node = new Node(item);
        if(back != null)
            back.next = node;
        back = node;
        if(front == null)
            front = back;
        size++;
    }

    public int pop() {
        if(!isEmpty()) {
            int temp = front.item;
            front = front.next;
            size--;
            return temp;
        }
        else
            return -1;
    }
}