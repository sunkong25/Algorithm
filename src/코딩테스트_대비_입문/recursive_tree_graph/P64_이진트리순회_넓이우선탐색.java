package 코딩테스트_대비_입문.recursive_tree_graph;


import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node lt, rt;

	public Node(int val) {
		data = val;
		lt = rt = null;
	}
}

public class P64_이진트리순회_넓이우선탐색 {
	Node root;

	public void BFS(Node root) {
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L=0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			System.out.print(L+" : ");
			for (int i = 0; i < len; i++) {
				Node cur = Q.poll();
				System.out.print(cur.data + " ");
				if(cur.lt != null) Q.add(cur.lt);
				if(cur.rt != null) Q.add(cur.rt);
			}
			L++;
			System.out.println();
		}
	}

	public static void main(String[] args) {
		P64_이진트리순회_넓이우선탐색 T = new P64_이진트리순회_넓이우선탐색();
		T.root = new Node(1);
		T.root.lt = new Node(2);
		T.root.rt = new Node(3);
		T.root.lt.lt = new Node(4);
		T.root.lt.rt = new Node(5);
		T.root.rt.lt = new Node(6);
		T.root.rt.rt = new Node(7);
		T.BFS(T.root);
	}
}
