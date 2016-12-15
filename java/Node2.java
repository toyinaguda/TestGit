public class Node2 {
	public int data;
	public Node2 left;
	public Node2 right;

	public Node2(int data){
		this.data = data;
		left = null;
		right = null;
	}
	
	public Node2(){
		left = null;
		right = null;
	}
	
	public int getData(){
		return data;
	}	
}