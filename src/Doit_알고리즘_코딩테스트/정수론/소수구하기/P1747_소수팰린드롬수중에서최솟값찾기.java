package Doit_알고리즘_코딩테스트.정수론.소수구하기;

import java.util.Scanner;

public class P1747_소수팰린드롬수중에서최솟값찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] A = new int[10000001];
        for (int i = 2; i < A.length; i++) {
            A[i] = i;
        }

        for (int i = 2; i < Math.sqrt(A.length); i++) {
            if (A[i] == 0) {
                continue;
            }
            for (int j = i + i; j < A.length; j = j + i) {
                A[j] = 0;
            }
        }

        int i = N;
        while (true) {
            if (A[i] != 0) {
                int result = A[i];
                char c[] = String.valueOf(result).toCharArray();
                int start = 0;
                int end = c.length - 1;
                boolean e = true;

                while (start < end) {
                    if (c[start] != c[end]) {
                        e = false;
                        break;
                    }
                    start++;
                    end--;
                }

                if (e == true) {
                    System.out.println(result);
                    break;
                }
            }
            i++;
        }
    }
}
