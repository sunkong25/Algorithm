package Doit_알고리즘_코딩테스트.정렬.선택정렬;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1427_내림차순으로자릿수정렬하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = br.readLine().toCharArray();
        int[] A = new int[c.length];
        int Max;
        int index = 0;

        for (int i = 0; i < A.length; i++) {
            A[i]=(int)c[i]-'0';
        }

        for (int i = 0; i < A.length; i++) {
            Max = i;
            for (int j = i; j < A.length; j++) {
                if (A[Max] < A[j]) {
                    Max = j;
                }
            }
            int temp = A[i];
            A[i] = A[Max];
            A[Max] = temp;
        }

        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]);
        }
    }
}
