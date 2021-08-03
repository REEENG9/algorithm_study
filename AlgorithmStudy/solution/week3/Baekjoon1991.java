package AlgorithmStudy.solution.week3;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 문제이름 : 트리순회
 * 링크 : https://www.acmicpc.net/problem/1991
 * 알고리즘 분류
 * - 트리
 * - 재귀
 */

public class Baekjoon1991 {
    
    public static Tree[] tree;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        tree = new Tree[N];
        for (int i = 0; i < tree.length; i++) 
            tree[i] = new Tree();

        int parent,leftChild,rightChild;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char temp = st.nextToken().charAt(0);
            parent = temp - 65;
            temp = st.nextToken().charAt(0);
            if (temp != '.') {
                leftChild = temp - 65;
                tree[parent].left = leftChild;    
            }
            temp = st.nextToken().charAt(0);
            if (temp != '.') {
                rightChild = temp - 65;
                tree[parent].right = rightChild;
            }
        }
        
        preOrder(0);
        System.out.println();
        inOrder(0);
        System.out.println();
        postOrder(0);
        System.out.println();
    }

    public static void preOrder(int node) {
        
        System.out.print((char)(node+65));

        int leftChild = tree[node].left;
        if (leftChild != -1) 
            preOrder(leftChild);

        int rightChild = tree[node].right;
        if (rightChild != -1) 
            preOrder(rightChild);
        
    }

    public static void inOrder(int node) {
    
        int leftChild = tree[node].left;
        if (leftChild != -1) 
            inOrder(leftChild);

        System.out.print((char)(node+65));

        int rightChild = tree[node].right;
        if (rightChild != -1) 
            inOrder(rightChild);
        
    }

    public static void postOrder(int node) {
        
        int leftChild = tree[node].left;
        if (leftChild != -1) 
            postOrder(leftChild);

        int rightChild = tree[node].right;
        if (rightChild != -1) 
            postOrder(rightChild);
        
        System.out.print((char)(node+65));
    }
}

class Tree {
    public int left;
    public int right;

    public Tree() {
        this.left = -1;
        this.right = -1;
    }
}

/*
A - B C
B - D
C - E F
E - 
F - G
D - 
G - 


 */