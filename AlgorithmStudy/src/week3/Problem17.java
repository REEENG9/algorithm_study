package week3;
import java.io.*;
import java.util.*;

/**
 * 백준 1991번
 * 트리 순회
 * 분류 : 트리, 재귀
 */
public class Problem17 {
    static int N;
    static int[][] tree;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        tree = new int[N+1][2]; // [부모노드][왼,오 자식]
        
        for (int i = 0 ; i < N ; i++) {
            st = new StringTokenizer(br.readLine());
            int parent = st.nextToken().charAt(0) - 64;
            char left = st.nextToken().charAt(0); 
            char right = st.nextToken().charAt(0); 
            if(left != '.')
                tree[parent][0] = left - 64;
            if(right != '.')
                tree[parent][1] = right - 64;
        }
        
        preorder(1);
        System.out.println();
        inorder(1);
        System.out.println();
        postorder(1);
    }

    public static void preorder(int node) {
        if(node == 0)
            return;
        System.out.print((char)(node+64));
        preorder(tree[node][0]);
        preorder(tree[node][1]);
    }
    public static void inorder(int node) {
        if(node == 0)
            return;
        inorder(tree[node][0]);
        System.out.print((char)(node+64));
        inorder(tree[node][1]);
    }
    public static void postorder(int node) {
        if(node == 0)
            return;
        postorder(tree[node][0]);
        postorder(tree[node][1]);
        System.out.print((char)(node+64));
    }
}