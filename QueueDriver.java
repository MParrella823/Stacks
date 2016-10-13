
public class QueueDriver {

	public static void main(String[] args) {
	
		Queue q = new Queue();
		
		q.enQueue(5);
		q.enQueue(8);
		q.enQueue(3);
		
		System.out.print("Current List: "); 
		q.print();
		System.out.println("Count: " + q.getCount());

		System.out.println("Removing: " + q.deQueue());
		System.out.println();
		System.out.print("Current List: "); 
		q.print();
		System.out.println("Count: " + q.getCount());
		
		System.out.println("Removing: " + q.deQueue());
		System.out.println();
		System.out.print("Current List: "); 
		q.print();
		System.out.println("Count: " + q.getCount());
		
		System.out.println("Removing: " + q.deQueue());
		System.out.println();
		System.out.print("Current List: "); 
		q.print();
		System.out.println("Count: " + q.getCount());

		
		
	}

}
