
public class Stack extends List {
	
	/**
	 * 
	 * This method will add an integer item to the stack
	 * 
	 * @param val integer to be added to the stack
	 * @return void
	 *
	 */
	
	public void push(int val){
		this.add(val);
	}
	
	/**
	 * 
	 * This method will remove the most recently added integer from the list and return it 
	 * 
	 * @return int Integer value that was removed from the stack
	 */
	
	public int pop(){
		Node n = this.removeFirst();
		if (n == null){
			//System.out.println("Stack is empty!");
			return 0;
		}
		return n.getData();
		
	}
	
	/**
	 * 
	 * This method will return the number of items in the stack
	 * 
	 * @return count integer value - number of items in the stack
	 * 
	 */
	
	public int size(){
		return this.getCount();
	}
	
	

}
