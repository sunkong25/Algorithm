package Doit_알고리즘_코딩테스트.탐색.이진탐색;

import java.util.Arrays;
import java.util.Scanner;

public class P1920_원하는정수찾기 {
    static int[] A;
    static int start;
    static int end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        A = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);

        int M = sc.nextInt();
        for (int i = 0; i < M; i++) {
            boolean find = false;
            int x = sc.nextInt();
            start = 0;
            end = A.length - 1;

            while (start <= end) {
                int k = (start + end) / 2;
                int kV = A[k];

                if (kV == x) {
                    find = true;
                    break;
                } else if (kV > x) {
                    end = k - 1;
                } else if (kV < x) {
                    start = k + 1;
                }
            }

            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}
