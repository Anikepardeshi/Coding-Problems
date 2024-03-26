package DataStructureImpl;

class Node {
	int key;
	Node left, right;

	public Node(int item) {
		key = item;
		left = right = null;
	}
}

public class BinarySearchTree {
	Node root;

	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = insertRec(root.left, key);
		else if (key > root.key)
			root.right = insertRec(root.right, key);

		return root;
	}

	// inoreder traversal
	void inorder() {

		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}

	}

	// preorder traversal
	void preorder() {
		preorderRec(root);
	}

	void preorderRec(Node root) {
		if (root != null) {
			System.out.print(root.key + " ");
			preorderRec(root.left);
			preorderRec(root.right);
		}

	}

	// Postorder traversal
	void postorder() {
		postorderRec(root);
	}

	void postorderRec(Node root) {
		if (root != null) {
			postorderRec(root.left);
			postorderRec(root.right);
			System.out.print(root.key + " ");
		}
	}

	public static void main(String[] args) {

		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.insert(10);

		System.out.println("inorder traversal of the BST :");
		tree.inorder();
		System.out.println();
		System.out.println("preorder traversal of the BST :");
		tree.preorder();
		System.out.println();
		System.out.println("postorder traversal of the BST :");
		tree.postorder();

	}

}
