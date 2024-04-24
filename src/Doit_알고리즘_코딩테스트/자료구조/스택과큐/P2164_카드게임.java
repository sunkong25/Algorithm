package Doit_알고리즘_코딩테스트.자료구조.스택과큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class P2164_카드게임 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int index = 1;
        int result = 0;

        Queue<Integer> card = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            card.add(i);
        }

        while (!card.isEmpty()) {
            if (index % 2 == 1) {
                result = card.poll();
            } else {
                result = card.poll();
                card.add(result);
            }
            index++;
        }
        System.out.println(result);
    }
}

