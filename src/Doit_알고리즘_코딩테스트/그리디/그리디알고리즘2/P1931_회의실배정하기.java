package Doit_알고리즘_코딩테스트.그리디.그리디알고리즘2;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class P1931_회의실배정하기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        PriorityQueue<Time> pq = new PriorityQueue<>(new TimeComparator());

        for (int i = 0; i < N; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            pq.add(new Time(start, end));
        }

        Time time;
        int start1 = 0;
        int end1 = 0;
        int start2;
        int end2;
        int count = 0;

        while (!pq.isEmpty()) {
            time = pq.remove();
            start2 = time.start;
            end2 = time.end;

            if (end1 > start2) {
                continue;
            } else {
                count++;
                start1 = start2;
                end1 = end2;
            }
        }
        System.out.println(count);
    }

    static class Time {
        int start;
        int end;

        Time(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    static class TimeComparator implements Comparator<Time> {
        @Override
        public int compare(Time o1, Time o2) {
            if (o1.end == o2.end) {
                return o1.start - o2.start;
            }
            return o1.end - o2.end;
        }
    }
}
