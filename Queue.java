
public class Queue extends List {

	public void enQueue(int val){
		
		this.add(val);
	}
	
	public int deQueue(){
		
		Node n = this.removeLast();
		
		if (n == null){
			System.out.println("Queue is empty!");
			return 0;
		}
		return n.getData();
		
	}
	
	
}
