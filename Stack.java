
public class Stack extends List {
	
	public void push(int val){
		this.add(val);
	}
	
	public int pop(){
		Node n = this.removeFirst();
		if (n == null){
			System.out.println("Stack is empty!");
			return 0;
		}
		return n.getData();
		
	}
	
	public int size(){
		return this.getCount();
	}
	
	

}
