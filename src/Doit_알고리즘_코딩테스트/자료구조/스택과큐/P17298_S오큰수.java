package Doit_알고리즘_코딩테스트.자료구조.스택과큐;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class P17298_S오큰수 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int A[] = new int[n];
        int ans[] = new int[n];
        String str[] = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(str[i]);
        }
        Stack<Integer> myStack = new Stack<>();
        myStack.push(0);
        for (int i = 1; i < n; i++) {
            while (!myStack.isEmpty() && A[myStack.peek()] < A[i]) {
                ans[myStack.pop()] = A[i];
            }
            myStack.push(i);
        }
        while (!myStack.isEmpty()) {
            ans[myStack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < n; i++) {
            bw.write(ans[i]+" ");
        }
        bw.write("\n");
        bw.flush();
    }
}
