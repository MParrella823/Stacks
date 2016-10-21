
public class ListDriver {

	public static void main(String[] args) {
			
    List list = new List();
	list.add(3);
	list.add(3);
	list.add(2);
	list.add(1);
	list.add(2);
    list.add(1);
    list.add(2);
    list.add(1);
    list.add(1);
    
    // Testing "corner case" for deldups() method (empty list)
    List list2 = new List();
    list2.deldups();
    
    // Testing deldups() and invert() methods
    System.out.println("TESTING DELDUPS() METHOD:");
    System.out.print("\nOriginal List: ");
    list.print();
    System.out.print("\nAfter invoking deldups(): ");    
    list.deldups();   
    list.print();
    System.out.println("\n\nTESTING INVERT() METHOD: ");
    
    list2.add(5);
    list2.add(4);
    list2.add(3);
    list2.add(2);
    list2.add(1);
    System.out.print("\nCurrent List: ");
    list2.print();
    System.out.print("\nAfter invoking invert(): ");
    list2.invert();
    list2.print();

    		
	}

}
