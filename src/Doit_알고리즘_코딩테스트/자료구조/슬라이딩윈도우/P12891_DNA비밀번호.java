package Doit_알고리즘_코딩테스트.자료구조.슬라이딩윈도우;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P12891_DNA비밀번호 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int P = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        String DNAString = br.readLine();

        int[] check = new int[4];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            check[i] = Integer.parseInt(st.nextToken());
        }

        char[] DNA = DNAString.toCharArray();
        int[] DNANum = new int[P];
        for (int i = 0; i < P; i++) {
            switch (DNA[i]) {
                case 'A':
                    DNANum[i] = 0;
                    break;
                case 'C':
                    DNANum[i] = 1;
                    break;
                case 'G':
                    DNANum[i] = 2;
                    break;
                case 'T':
                    DNANum[i] = 3;
                    break;

            }
        }

        int[] myCheck = new int[4];
        int startIndex = 0;
        int endIndex = S-1;
        int count = 0;
        int result = 0;

        for (int i = 0;  i < S; i++) {
            for (int j = 0; j < 4; j++) {
                if (DNANum[i] == j) {
                    myCheck[j]++;
                }
            }
        }

        while (true) {
                count=0;
                for (int k = 0; k < 4; k++) {
                    if (myCheck[k] >= check[k]) {
                        count++;
                    }
                }
                if (count == 4) {
                    result++;
                }
                myCheck[DNANum[startIndex]] = myCheck[DNANum[startIndex]] - 1;
                startIndex++;
                endIndex++;
                if(endIndex < P){
                    myCheck[DNANum[endIndex]] = myCheck[DNANum[endIndex]] + 1;
                }else{
                    break;
                }
            }
        System.out.println(result);
    }
}
