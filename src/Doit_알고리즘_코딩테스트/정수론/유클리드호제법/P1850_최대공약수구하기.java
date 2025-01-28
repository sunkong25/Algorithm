package Doit_알고리즘_코딩테스트.정수론.유클리드호제법;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class P1850_최대공약수구하기 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long b = sc.nextLong();

        long c = gdc(a, b);
        while (c > 0) {
            bw.write("1");
            c--;
        }
        bw.flush();
        bw.close();
    }

    static long gdc(long a, long b) {
        long c = a % b;
        if (c == 0) {
            return b;
        }
        return gdc(b, c);
    }
}
