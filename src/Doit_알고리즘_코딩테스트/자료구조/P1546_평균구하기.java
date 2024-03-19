package Doit_알고리즘_코딩테스트.자료구조;

import java.util.Scanner;

public class P1546_평균구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int score = 0;
        int sum = 0;
        int max = 0;
        double avg = 0;

        for (int i = 0; i < N; i++) {
            score = sc.nextInt();
            if (score > max) {
                max = score;
            }
            sum += score;
        }

        avg = (double)sum/max*100/N;
        System.out.print(avg);
    }
}
