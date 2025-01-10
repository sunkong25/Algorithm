package Doit_알고리즘_코딩테스트.그리디.그리디알고리즘;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1744_수를묶어서최댓값만들기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Integer> positive = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> negative = new PriorityQueue<>();
        int zero = 0;
        int one = 0;
        int sum = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            if (num == 0) {
                zero++;
            } else if (num == 1) {
                one++;
            } else if (num > 1) {
                positive.add(num);
            } else if (num < 0) {
                negative.add(num);
            }
        }

        while (positive.size() > 1) {
            int num1 = positive.remove();
            int num2 = positive.remove();

            sum += num1 * num2;
        }

        while (negative.size() > 1) {
            int num1 = negative.remove();
            int num2 = negative.remove();

            sum += num1 * num2;
        }

        if (positive.size() == 1) {
            sum += positive.remove();
        }

        if (negative.size() == 1 && zero > 0) {
            sum += negative.remove() * 0;
        } else if (negative.size() == 1) {
            sum += negative.remove();
        }

        sum += one;
        System.out.println(sum);
    }
}
