package Doit_알고리즘_코딩테스트.자료구조.투포인터;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1940_주몽의명령 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);

        int sum = A[0]+A[N-1];
        int i = 0;
        int j = N - 1;
        int count = 0;

        while (i < j) {
            if (sum == M) {
                count++;
                sum = A[++i] + A[--j];
            } else if (sum < M) {
                sum = A[++i] + A[j];
            } else {
                sum = A[i] + A[--j];
            }
        }
        System.out.println(count);

    }
}
