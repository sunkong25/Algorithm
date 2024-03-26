package Doit_알고리즘_코딩테스트.자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10986_나머지합구하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] A = new long[N + 1];
        long[] S = new long[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            S[i] = S[i - 1] + A[i];
        }

        long[] C = new long[M];

        for (int i = 1; i <= N; i++) {
            S[i] = S[i] % M;
            for (int j = 0; j < M; j++) {
                if (S[i] == j) {
                    C[j]++;
                }
            }
        }

        long count = C[0];
        long result = 0;

        for (int i = 0; i < M; i++) {
            if(C[i]>1){
                result += C[i]*(C[i]-1)/2;
            }
        }
        result = result + count;
        System.out.println(result);
    }
}
