package Doit_알고리즘_코딩테스트.탐색.너비우선탐색;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.OptionalInt;
import java.util.Queue;
import java.util.Scanner;

public class P1167_트리의지름구하기 {
    static int n;
    static ArrayList<Edge>[] A;
    static boolean[] visited;
    static int[] distance;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        A = new ArrayList[n + 1];

        for (int i = 1; i <= n; i++) {
            A[i] = new ArrayList<Edge>();
        }

        for (int i = 1; i <= n; i++) {
            int e;
            int v;
            int es = sc.nextInt();

            while (true) {
                e = sc.nextInt();
                if(e == -1){
                    break;
                }
                v = sc.nextInt();

                A[es].add(new Edge(e, v));
            }
        }

        visited = new boolean[n + 1];
        distance = new int[n + 1];
        BFS(1);
        int max = distance[1];
        int index = 1;
        for (int i = 2; i < n + 1; i++) {
            if (max < distance[i]) {
                max = distance[i];
                index = i;
            }
        }
        visited = new boolean[n + 1];
        distance = new int[n + 1];
        BFS(index);
        int maxValue = Arrays.stream(distance)
                .max()
                .orElse(0);
        System.out.println(maxValue);
    }

    static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (Edge i : A[node]) {
                int e = i.e;
                int v = i.value;
                if (!visited[e]) {
                    queue.add(e);
                    visited[e] = true;
                    distance[e] = distance[node] + v;
                }
            }


        }
    }

    static class Edge {
        int e;
        int value;

        public Edge(int e, int value) {
            this.e = e;
            this.value = value;
        }
    }
}
