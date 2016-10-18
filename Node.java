
public class Node {
	
	private int data;  // Integer data within the Node
	private Node next;  // Pointer to next Node
	
	public Node(){
		
		data = 0;
		next = null;
		
	}
	
	public Node(int val, Node n){
		data = val;
		next = n;
	}
	
	public Node(int val){
		data = val;
		next = null;		
	}
	
	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}
	
	/**
	 * @param data the data to set
	 */
	public void setData(int data) {
		this.data = data;
	}
	
	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}
	
	/**
	 * @param next the next to set
	 */
	public void setNext(Node next) {
		this.next = next;
	}
	
	

}
