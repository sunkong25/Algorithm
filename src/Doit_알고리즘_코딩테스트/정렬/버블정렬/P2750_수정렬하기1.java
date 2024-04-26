package Doit_알고리즘_코딩테스트.정렬.버블정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P2750_수정렬하기1 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int temp;

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (A[j] > A[j+1]) {
                    temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] =temp;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            System.out.println(A[i]);
        }
    }
}
