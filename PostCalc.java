import java.util.Scanner;


public class PostCalc {
	
		public static void execute(){
			String s = null;
			
			do {
				Stack s1 = new Stack();
				System.out.print("#");
				Scanner kb  = new Scanner(System.in);
				s = kb.nextLine(); // Takes user's input from the keyboard, entire line at a time
				Scanner input = new Scanner(new String(s)); // Converts input to a String
				
				int answer = 0;
				
				if (s.equals("quit")){
					kb.close();
					input.close();
					break;
				}
				
				else{
				
					/*
					 * The following loop will traverse the string, storing the value at each index
					 * as a character variable.  It will then check if that variable is a digit or an operand.
					 * 
					 * If it's a digit, it will add that number to the stack and continue on in this manner
					 * until it finds an operand.  It will then perform that arithmatic on the two numbers in 
					 * in the stack and push the answer onto the stack.
					 * 
					 */

					for (int i = 0; i < s.length(); i ++){  
						int a = 0;
						int b = 0;
						int d = 0;
						char c = s.charAt(i);  // Variable to hold the character value at each index

						if (Character.isDigit(c) == true){  
							int x = Character.getNumericValue(c); // If yes, get the numerical value (otherwise ASCII value is used)
							s1.push(x); 
						}

						/*
						 * The remaining conditionals will check for operands in the string.
						 * If found, it will perform the operation on the previous two numbers
						 * and add the result to the stack
						 * 
						 */

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
							
							if (a == 0){
								
								System.out.println("Error: Division by zero!");
								
							}
							
							else{
								d = b / a;
								s1.push(d);
							}
						}					
					}				
				// The last item added to the stack will be the final answer
			 	answer = s1.pop();
				System.out.println("Answer: " + answer);
				}
			}
			
			while (!s.equals("quit"));
			System.out.println("Exiting the PostCalc program!");		
		}
}
