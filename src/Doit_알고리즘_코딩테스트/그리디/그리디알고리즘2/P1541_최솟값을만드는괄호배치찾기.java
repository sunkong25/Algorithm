package Doit_알고리즘_코딩테스트.그리디.그리디알고리즘2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541_최솟값을만드는괄호배치찾기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();


        String[] split = A.split("-");
        int[] sum = new int[split.length];

        for (int i = 0; i < split.length; i++) {
            String[] num = split[i].split("\\+");
            for (int j = 0; j < num.length; j++) {
                sum[i] += Integer.parseInt(num[j]);
            }
        }

        int result = sum[0];
        for (int i = 1; i < sum.length; i++) {
            result -= sum[i];
        }

        System.out.println(result);
    }
}
