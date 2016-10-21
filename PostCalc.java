import java.util.Scanner;

/**
 * @author Matt Parrella
 *
 */

public class PostCalc {
	/**
	 * 
	 * This method will simulate a post-fix calculator.  Will continue to ask for input until user
	 * enters 'quit'.
	 * 
	 * @return void 
	 * 
	 */
	public static void execute(){
		String s = null;
		Scanner kb  = new Scanner(System.in);

		do {
			Stack s1 = new Stack();
			System.out.print("#");
			s = kb.nextLine(); // Takes user's input from the keyboard, entire line at a time
			int answer = 0;
			
			if (s.equals("quit")){
				kb.close();
				break;
			}

			else{	

				int a = 0;
				int b  = 0;
				int val = 0;
				int d = 0;
				char c = 0;

				for (int i = 0; i < s.length(); i++){  // Loop through the string

					c = s.charAt(i);
                    
					
					/*
					 * 
					 * Lines 51 - 54 will perform two checks.  First, to ensure there is no 
					 * white space at the index. And second, to ensure the character at the index
					 * is a digit.  Numbers that have more than one digit will be covered as the 
					 * val variable is updated accordingly.
					 * 
					 * 
					 */
					if (Character.isWhitespace(c) == false){
						if (Character.isDigit(c) == true){
							val = val * 10 + Character.getNumericValue(c);
						}
						
						//  The following conditionals will check for operands, perform them and push/pop from the stack accordingly
						else if (c == '+'){
							a = s1.pop();
							b = s1.pop();
							d = b + a;
							s1.push(d);
						}

						else if (c == '-'){
							a = s1.pop();
							b = s1.pop();
							d = b - a;
							s1.push(d);
						}
						
						else if (c == '*'){
							a = s1.pop();
							b = s1.pop();
							d = b * a;
							s1.push(d);
						}

						else if (c == '/'){
							a = s1.pop();
							b = s1.pop();
							if (a == 0){ // Check if denominator is 0
								System.out.println("Error: Division by zero!");
							}
							else {
								d = b / a;
								s1.push(d);
							}
						}
					}

					/*
					 * Lines 95-100 will handle the case where the character at the index
					 * is a whitespace.  If val is greater than zero, it will push to the stack. 
					 * If this check was not made, the value of 0 would be pushed to the stack, causing
					 * miscalculations.
					 * 
					 */
					else {
						if (val != 0){
							s1.push(val);
						}
						val = 0;	
					}	

				}			

			}
			answer = s1.pop();
			System.out.println("Answer: " + answer);
		}
		while (!s.equals("quit"));
		kb.close();
		System.out.println("Exiting the PostCalc program!");		
	}
}
