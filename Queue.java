
public class Queue extends List {

	public void enQueue(int val){
		
		this.add(val);
	}
	
	public int deQueue(){
		
		Node n = this.removeLast();
		return n.getData();
		
	}
	
	
}
