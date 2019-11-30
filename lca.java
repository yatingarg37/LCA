package assignments;

import java.util.Scanner;

 class Node {
	Node left, right;
	int data;

	Node(int d) {
		data = d;
		left = right = null;
	}
}
public class lca {

	static Node root;

	Node findlca(int a, int b) {
		return lowest(root, a, b);
	}

	Node lowest(Node root, int a, int b) {
		if (root == null) {
			return root;
		}
		if (root.data == a || root.data == b) {
			return root;
		}
		Node l = lowest(root.left, a, b);
		Node r = lowest(root.right, a, b);
		if (l != null && r != null) {
			return root;
		}
		return (l != null) ? l : r;
	}

	public static void main(String arg[]) {
		Scanner sc = new Scanner(System.in);
		lca li = new lca();
		li.root = new Node(1);
		li.root.left = new Node(2);
		li.root.right = new Node(3);
		li.root.left.left = new Node(4);
		li.root.left.right = new Node(5);
		li.root.right.left = new Node(6);
		li.root.right.right = new Node(7);
		System.out.println("Enter the Nodes");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Node num = li.lowest(li.root, a, b);
		System.out.print(num.data);

	}

}
