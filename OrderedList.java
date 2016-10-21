
public class OrderedList extends List {

	public void add(int val){
		
		System.out.println("Invoking OrderedList add method!");
		Node n = new Node(val);		
		Node curr = start;
		Node prev = null;
		
		// If start is null, just add Node
		if (curr == null){
			start = n;
			
		}
		else {
		// If start is not null, loop through list until we find a node whose data is greater
		// than val and insert the node behind current node
			while (curr != null){
				if (curr.getData() >= val){
					// Found location where val node should be inserted
					if (prev != null){
						// If node should be inserted in the middle of the list
						prev.setNext(n);
						n.setNext(curr);
						
					}
					else{
						// If val should be inserted to the front of the list
						start = n;
					}
					n.setNext(curr);
				    
					return;
				}
				else{
					// If val is not less than current node data, continue going through list
					prev = curr;
					curr = curr.getNext();
				}
			}
			// If val is not less than any data in the list, add it to the end of the list
			prev.setNext(n);
			
			
		}
	}

}
