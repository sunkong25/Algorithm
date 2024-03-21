package Doit_알고리즘_코딩테스트.자료구조;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P11660_구간합구하기2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int suNo = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());

        int[][] A = new int[suNo + 1][suNo + 1];
        for (int i = 1; i <= suNo; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= suNo; j++) {
                A[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int[][] D = new int[suNo + 1][suNo + 1];
        for (int i = 1; i <= suNo; i++) {
            for (int j = 1; j <= suNo; j++) {
                D[i][j] = D[i - 1][j] + D[i][j - 1] - D[i - 1][j - 1] + A[i][j];
            }
        }

        int x1,y1,x2,y2;
        for (int q = 0; q < quizNo; q++) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());

            int result = D[x2][y2]-D[x1-1][y2]-D[x2][y1-1]+D[x1-1][y1-1];
            System.out.println(result);
        }
    }
}
