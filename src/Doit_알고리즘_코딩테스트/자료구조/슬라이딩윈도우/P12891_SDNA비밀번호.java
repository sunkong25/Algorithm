package Doit_알고리즘_코딩테스트.자료구조.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_SDNA비밀번호 {
    static char[] A;
    static int[] myArr;
    static int[] checkArr;
    static int checkResult;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int result = 0;
        A = new char[S];
        checkArr = new int[4];
        myArr = new int[4];
        checkResult = 0;
        A = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 4; i++) {
            checkArr[i] = Integer.parseInt(st.nextToken());
            if (checkArr[i] == 0) {
                checkResult++;
            }
        }
        for (int i = 0; i < P; i++) {
            add(A[i]);
        }

        if (checkResult == 4) result++;

        for (int i = P; i < S; i++) {
            int j = i - P;
            add(A[i]);
            remove(A[j]);
            if (checkResult == 4) result++;
        }
        System.out.println(result);
        br.close();
    }

    private static void remove(char c) {
        switch (c) {
            case 'A':
                if (checkArr[0] == myArr[0]) checkResult--;
                myArr[0]--;
                break;
            case 'C':
                if (checkArr[1] == myArr[1]) checkResult--;
                myArr[1]--;
                break;
            case 'G':
                if (checkArr[2] == myArr[2]) checkResult--;
                myArr[2]--;
                break;
            case 'T':
                if (checkArr[3] == myArr[3]) checkResult--;
                myArr[3]--;
                break;
        }
    }

    private static void add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (checkArr[0] == myArr[0]) checkResult++;
                break;
            case 'C':
                myArr[1]++;
                if (checkArr[1] == myArr[1]) checkResult++;
                break;
            case 'G':
                myArr[2]++;
                if (checkArr[2] == myArr[2]) checkResult++;
                break;
            case 'T':
                myArr[3]++;
                if (checkArr[3] == myArr[3]) checkResult++;
                break;
        }
    }
}
