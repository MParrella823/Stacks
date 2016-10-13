
public class StackDriver {


	public static void main(String[] args) {
	
		Stack s = new Stack();
		s.add(5);
		s.add(2);
		s.add(4);
		s.print();
		System.out.println("Stack size: " + s.size());
		System.out.println("\n");
		
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		s.print();
		
		System.out.println("Stack size: " + s.size());
		
	
		
		
		
		
	}

}
