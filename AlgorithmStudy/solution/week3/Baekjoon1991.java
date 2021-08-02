package AlgorithmStudy.solution.week3;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 문제이름 : 트리순회
 * 링크 : https://www.acmicpc.net/problem/1991
 * 알고리즘 분류
 * - 트리
 * - 재귀
 */

public class Baekjoon1991 {
    
    public static ArrayList<Integer>[] tree;
    public static boolean[] visited;
    public static void main(String []args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        tree = new ArrayList[N];
        visited = new boolean[N];
        for (int i = 0; i < tree.length; i++) 
            tree[i] = new ArrayList<>();
        
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            char temp;
            int parent = st.nextToken().charAt(0) - 65;
            temp = st.nextToken().charAt(0);
            int leftChild = st.nextToken().charAt(0) - 65;
            int rightChild = st.nextToken().charAt(0) - 65;
            
            tree[parent].add(leftChild);
            tree[parent].add(rightChild);
        }
        

    }

    public static void order(int node) {
        int child;
        for (int i = 0; i < tree[node].size(); i++) {
            if (!visited[tree[node].get(i)]) {
                
            }
        }
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