package Doit_알고리즘_코딩테스트.탐색.너비우선탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class P1260_DFS와BFS프로그램 {
    static ArrayList<Integer>[] A;
    static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        A = new ArrayList[n + 1];

        for (int i = 1; i < n + 1; i++) {
            A[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            A[s].add(e);
            A[e].add(s);
        }

        for (int i = 1; i <= n; i++) {
            Collections.sort(A[i]);
        }

        visited = new boolean[n + 1];
        DFS(start);
        System.out.println();
        visited = new boolean[n + 1];
        BFS(start);
        System.out.println();
    }

    static void DFS(int v) {
        System.out.print(v + " ");
        visited[v] = true;
        for (int i : A[v]) {
            if (!visited[i]) {
                DFS(i);
            }
        }
    }

    static void BFS(int v) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(v);
        visited[v] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");
            for (int i : A[node]) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
