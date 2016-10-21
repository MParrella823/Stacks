public class List {

	protected Node start;
	protected int count;
	
	public List(){
		start = null;
		count = 0;
	}		
	
	/**
	 * @return the start
	 */
	public Node getStart() {
		return start;
	}
	
	/**
	 * @param start the start to set
	 */
	public void setStart(Node start) {
		this.start = start;
	}
	
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	/**
	 * This method will add the passed value to the front of the list as a new node
	 * 
	 * @param val int The number to be added to the list
	 * 
	 */
	
	public void add(int val){
		
		//System.out.println("Invoking list add method!");
		
		Node n = new Node(val);
		
		//If list is empty
		if (start == null){			
			start = n;			
		}
		
		else{			
			n.setNext(start);
			start = n;
		}
			
		count++;
	}
	
	/**
	 * Will remove the passed value from the linked list.
	 * 
	 * @param val int type - number to remove from the list
	 * @return void 
	 */
	
	public void remove(int val){
		
		Node curr = start;
		Node prev = start;
			
		
		// Step 1: Check to see if list is empty
		if (start == null){
			System.out.println("\nList is empty! Cannot remove " + val +"!");
			
		}
		// Step 2: Check to see if the first node needs to be removed
		
		else if (curr.getData() == val){
			start = curr.getNext();
			count--;
		}
		
		else if (curr.getData() == val && count == 1){
			start = null;
			count--;
		}
		
		/* 
		 * Step 3: If it's not the first node, loop through nodes 
		 * to find which node needs to be removed
		 *
		 */		
		
		
		else{
			
			while (curr.getData() != val){
			     
				curr = curr.getNext();
				
				if (curr == null){
					System.out.println(val + " Not found");
					break;
				}
			     
			   /*
			    * Move prev pointer by 1 only after curr pointer moves.
			    * This will keep prev pointer 1 node behind curr
			    */
			     
			   if (curr.getData() != val){
				   prev = prev.getNext();
			   }
			}			
			
			/*			
			 * When the value is found, the loop will terminate.
			 * curr will be pointing to the node that needs to be removed.
			 * prev will be pointing to the node just before curr
			 * 
			 */
		
			// Step 4:  Set prev pointer to curr pointer
			// if curr is not null to remove the target 
			// node and decrement 'count' if curr is not null
			
			// Final step: check to make sure value was found in the list 	
			if (curr !=null){
				prev.setNext(curr.getNext());			
				count--;	
			}
	    }
	
	}
	
	/**
	 * 
	 * This method will print the list object that it is called upon and return the count as well.
	 * 
	 * @return void
	 * 
	 */
	
	public void print(){
		Node curr = start;		
		  while (curr != null){	    	
		    	System.out.print(curr.getData() + " ");
		    	curr = curr.getNext();		
		  }		
		  
		  System.out.println();
		 // System.out.println("Count: " + count);
	}
	
	/**
	 * 
	 * This method will reverse the order in which the list is printed out. Example: 12345 will be 54321
	 * after this method is called on a list object.
	 * 
	 * @return void
	 */
					
	public void invert(){
		
	 Node curr = start;
	 Node prev = null;
	 
	 // Gets the data of the first node of the list and creates a new node
	 Node n = new Node(curr.getData());
	 prev = n;
	 
	 	// Loop through remainder of the list
	 	while (curr.getNext() != null){
		    
	 		// Take the next node of the list and add link it to prev node
	 		Node x = new Node();
	 		curr = curr.getNext();
	 		x.setData(curr.getData());
	 		x.setNext(prev);
	 		prev = x; 
	 		start = x;
	 	}		 
	 }
	
	/**
	 * This method will remove any duplicate entries in the list and return the list of unique numbers.
	 * 
	 * @return void
	 * 
	 */
	
	public void deldups(){
		
		// Create new list to add nodes from previous list to
		List list = new List();
		Node curr = start;	
		Node n = new Node();
		
		// Check to ensure list object to be parsed is not empty, if it is print error message to user
		if (start == null){
			System.out.println("Error: List is empty!\n");
		}		
		else{
			// Grab the first node's data and put it into a new node and set start ptr to it
			n.setData(curr.getData());
			n.setNext(null);
			list.setStart(n);
			count++; // Needs to be incremented one to keep current count correct, otherwise will be off by 1
				
			while (curr != null){			
			    // Call isPresent() method to check if the current node's data isn't already in the new list, add it
				if (list.isPresent(curr.getData()) == false){
					Node x = new Node();
					x.setData(curr.getData()); //create new node
					x.setNext(n);
					list.add(x.getData()); //add to new list
					list.setStart(x);
					n = x;
					curr = curr.getNext();
				}
				/* If the current node's data has already been added to the new list, keep traversing list
				 * and decrement count each time (since we are essentially removing a node from the list in this
				 * conditional)
				 */
				else{				
					curr = curr.getNext();
					count--;
				}
			
			}
		}
		
		if (start != null){
			// Set the start ptr to the last node in the list
			start = n;
			invert(); // call invert() method to keep order of numbers the same as they were before (without duplicates)
		}
	}
	
	/**
	 * This method will scan a list and check if the passed parameter is present in the list or not.  Will return a true/false
	 * expression based on its findings.
	 * 
	 * @param val int parameter passed into the method to be looked for in a list
	 * @return boolean if the val parameter passed is present in the list or not 
	 */
	
	public boolean isPresent(int val){
		
	  Node curr = start;
		
		if (start == null){
			return false;
		}
		else{
			while (curr != null){
				if (curr.getData() == val){
					return true;
				}
				else{
					curr = curr.getNext();
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * 
	 * This method will remove the last node from the list and return it's pointer to the user.
	 * 
	 * 
	 * @return curr Type Node, the last node in the list
	 * 
	 */
	
	
	public Node removeLast(){
		
		Node curr = start;
		Node prev = start;
		if (start != null && this.getCount() > 1){
			while (curr.getNext() != null){
				curr = curr.getNext();
				if (curr.getNext() != null){
					prev = prev.getNext();
				}
			}
		prev.setNext(null);
		count --;
		return curr;
		}
		else if (start != null && this.getCount() == 1){
			start = null;
			count --;
			return curr;
		}
		
		else {
		   return null;
		}
		
		
	}
	
	/**
	 * 
	 * This method will remove the first node from a list and print out the Node location in memory.
	 * 
	 * @return Node The first node in the list that was removed
	 */
	
	public Node removeFirst(){
		
		Node n = start;
		
		if (start == null){
			return null;			
		}
		
		if (start != null){
			start = start.getNext();
		}
		
		count--;
		return n;
		
		
	}
	

} // end of List class