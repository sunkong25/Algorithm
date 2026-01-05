package 코딩테스트_대비_입문.recursive_tree_graph;

import java.util.LinkedList;
import java.util.Queue;

class TreeNodeBFS {
	int data;
	TreeNodeBFS lt, rt;

	public TreeNodeBFS(int data) {
		this.data = data;
		lt = rt = null;
	}
}

public class P67_Tree말단노드까지의가장짧은경로_BFS {
	TreeNodeBFS root;

	public int BFS(TreeNodeBFS root) {
		Queue<TreeNodeBFS> Q = new LinkedList<>();
		Q.offer(root);
		int L = 0;
		while (!Q.isEmpty()) {
			int len = Q.size();
			for (int i = 0; i < len; i++) {
				TreeNodeBFS cur = Q.poll();
				if (cur.rt == null && cur.lt == null) {
					return L;
				}
				if (cur.lt != null) {
					Q.offer(cur.lt);
				}
				if (cur.rt != null) {
					Q.offer(cur.rt);
				}
			}
			L++;
		}
		return 0;
	}

	public static void main(String[] args) {
		P67_Tree말단노드까지의가장짧은경로_BFS T = new P67_Tree말단노드까지의가장짧은경로_BFS();
		T.root = new TreeNodeBFS(1);
		T.root.lt = new TreeNodeBFS(2);
		T.root.rt = new TreeNodeBFS(3);
		T.root.lt.lt = new TreeNodeBFS(4);
		T.root.lt.rt = new TreeNodeBFS(5);
		System.out.println(T.BFS(T.root));
	}
}
