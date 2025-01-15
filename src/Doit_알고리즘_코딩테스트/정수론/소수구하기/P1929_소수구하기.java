package Doit_알고리즘_코딩테스트.정수론.소수구하기;

import java.util.Scanner;

public class P1929_소수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean[] A = new boolean[N + 1];

        A[1] = true;
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (A[i] == false) {
                for (int j = 2; j <= N; j++) {
                    if (i * j <= N) {
                        if (A[i * j] == false) {
                            A[i * j] = true;
                        }
                    }
                }
            }
        }

        for (int i = M; i <= N; i++) {
            if (A[i] == false) {
                System.out.println(i);
            }
        }
    }
}
