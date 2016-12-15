public class BinarySearchTree{
	public Node2 root;
	
	public BinarySearchTree(){
		root = null;
	}
	
	public void insert(int data){
		Node2 newNode2 = new Node2();
		newNode2.data = data;
		if(root == null)
			root = newNode2;
		else{
			Node2 current = root;
			Node2 parent;
			while(true){
				parent = current;
				if(data < current.data){
					current = current.left;
					if(current == null){
						parent.left = newNode2;
						break;
					}
				}else {
					current = current.right;
					if(current == null){
						parent.right = newNode2;
						break;
					}
				}
			}
		}
	}

	public void inOrder(){
		inOrder(root);
	}

	private void inOrder(Node2 n){
		if(n != null){
			inOrder(n.left);
			System.out.println(n.getData());
			inOrder(n.right);
		}
	}
	
	public void preOrder(){
		preOrder(root);
	}

	private void preOrder(Node2 n){
		if(n != null){
			System.out.println(n.getData());
			preOrder(n.left);
			preOrder(n.right);
		}
	}
	public void postOrder(){
		postOrder(root);
	}

	private void postOrder(Node2 n){
		if(n != null){
			postOrder(n.left);
			postOrder(n.right);
			System.out.println(n.getData());
		}
	}
	
	public int min(){
		Node2 current = root;
		while(current.left != null){
			current = current.left;
		}
		return current.getData();
	}
	
	public int max(){
		Node2 current = root;
		while(current.right != null){
			current = current.right;
		}
		return current.getData();
	}
}