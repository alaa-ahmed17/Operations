package DataEntryWithCheck;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

import operations.*;

//the user enter the numbers to make operations on them
public class NumberList {
    private static LinkedList<Float> Nums=new LinkedList<Float>();
    private static int i=0;
    public static LinkedList<Float> enterNumbers(){
        System.out.println("Enter the numbers you want to make operations on them and write 'done' when finsh ");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number("+(++i)+"): ");
            String input = scanner.nextLine(); // Read input as a string

            if (input.equalsIgnoreCase("done")) {
                break; // Exit loop if user types 'done'
            }

            try {
                // Parse input to Float and add to the list
                float number = Float.parseFloat(input);
                Nums.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number or type 'done' to finish.");
            }
        }
        return Nums;
    }

    // the user will enter the symbol of operator you want
    public static Operations enterOperator(HashMap<String,Operations> operationsMap, LinkedList<Float> numbers) {
        System.out.println("enter the operation do you want on these numbers as + , - , * , /  or write 'f' if you want to exit ");
        Scanner s = new Scanner(System.in);
        String input = ""; // Read input as a string
        operationsMap.put("+", new Addition(numbers));
        operationsMap.put("-", new Subtraction(numbers));
        operationsMap.put("*", new Multiplication(numbers));
        operationsMap.put("/", new Division(numbers));
        // Loop until a valid operator is entered
        while (!input.equals("f")) {
            input = s.nextLine().trim(); // Read and sanitize user input

            if (operationsMap.containsKey(input)) {
                return operationsMap.get(input); // Return the corresponding operation
            } else {
                System.out.println("Invalid operation. Please enter one of the following: +, -, *, /");
            }
        }
        return operationsMap.get(input);
    }
}

