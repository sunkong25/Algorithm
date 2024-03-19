package Doit_알고리즘_코딩테스트.자료구조;

import java.util.Scanner;

public class P11659_구간합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] A = new int[N+1];
        int[] S = new int[N+1];

        for (int i = 1; i < N+1; i++) {
            A[i] = sc.nextInt();
            S[i] = S[i-1]+A[i];
        }

        for (int k = 0; k < M; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();

            System.out.println(S[j] - S[i - 1]);
        }
    }
}
