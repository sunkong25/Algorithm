package Doit_알고리즘_코딩테스트.자료구조.투포인터;

import java.util.Scanner;

public class P2018_연속된자연수의합구하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int sum = 1;
        int count = 1;
        int start_index = 1;
        int end_index = 1;

        while (end_index != N) {
            if (sum > N) {
                sum = sum - start_index;
                start_index++;
            } else if (sum == N) {
                end_index++;
                sum = sum + end_index;
                count++;
            } else {
                end_index++;
                sum = sum + end_index;
            }
        }
        System.out.println(count);
    }
}
