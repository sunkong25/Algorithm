package Doit_알고리즘_코딩테스트.그리디.그리디알고리즘1;

import java.util.Scanner;

public class P11047_동전개수의최솟값구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int amount = sc.nextInt();
        int[] A = new int[N + 1];
        int count = 0;

        for (int i = 1; i < N + 1; i++) {
            A[i] = sc.nextInt();
        }

        for (int i = N; i > 0; i--) {
            if (amount >= A[i]) {
                count += amount / A[i];
                amount = amount % A[i];
            }
        }

        System.out.println(count);
    }
}
