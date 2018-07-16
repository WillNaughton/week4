package week4;

import java.util.Scanner;

public class Calculator {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = scanner.nextLine();
		String[] elements = parseString(input);
		while(true) {if (isValidInput(elements)) {
		
			
			System.out.println(performOperation(elements)); 
		}else {
			System.out.println("NOT CORRECT IMPUT");
		}
}
				
	}
	static String[] parseString(String str) {
	return str.split(" ");
		
	}
	static boolean isValidInput(String[] input) {
		return input.length == 3 
				&& isNumeric(input[0])
				&& isNumeric(input[2])
				&& isOperator(input[1]);

	}
	static boolean isOperator(String input) {
		return input.equals("+")
			|| input.equals("/")
			|| input.equals("*")
			|| input.equals("-");
	}
	
	public static boolean isNumeric(String str){
	  return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
	}
	static int performOperation(String[] input) {
        int result = 0;
        if (input[1].equals("+")) {
            result = addNumbers(input[0], input[2]);
        } else if (input[1].equals("-")) {
            result = subtractNumbers(input[0], input[2]);
        } else if (input[1].equals("*")) {
            result = multiplyNumbers(input[0], input[2]);
        } else {
            result = divideNumbers(input[0], input[2]);
        }
        return result;
    }
	static int addNumbers(String left, String right) {
		return Integer.parseInt(left) + Integer.parseInt(right);
	}
	static int multiplyNumbers(String left, String right) {
		return Integer.parseInt(left) * Integer.parseInt(right);		
	}
	static int divideNumbers(String left, String right) {
		return Integer.parseInt(left) / Integer.parseInt(right);
	}
	static int subtractNumbers(String left, String right) {
		return Integer.parseInt(left) - Integer.parseInt(right);
	}
}