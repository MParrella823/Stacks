
public class QueueDriver {

	public static void main(String[] args) {
	
		Queue q = new Queue();
		
		q.enQueue(6);
		q.enQueue(2);
		q.enQueue(5);
		
		q.print();
		System.out.println("Count: " + q.getCount());

		System.out.println("Removing: " + q.deQueue());
		System.out.println();
		q.print();
		System.out.println("Count: " + q.getCount());
		
		System.out.println("Removing: " + q.deQueue());
		System.out.println();
		q.print();
		System.out.println("Count: " + q.getCount());
		
		System.out.println("Removing: " + q.deQueue());
		q.print();
		System.out.println("Count: " + q.getCount());

		
		
	}

}
