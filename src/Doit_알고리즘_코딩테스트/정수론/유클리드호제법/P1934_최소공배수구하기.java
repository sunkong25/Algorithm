package Doit_알고리즘_코딩테스트.정수론.유클리드호제법;

import java.util.Scanner;

public class P1934_최소공배수구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        int result;
        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int gcd = GCD(A, B);
            result = A * B / gcd;
            System.out.println(result);
        }
    }

    static int GCD(int A, int B) {
        int C = A % B;
        if (C == 0) {
            return B;
        }
        return GCD(B, C);
    }
}
