
public class Stack extends List {
	
	public void push(int val){
		this.add(val);
	}
	
	public int pop(){
		Node n = this.removeFirst();
		return n.getData();
		
	}
	
	public int size(){
		return this.getCount();
	}
	
	

}
