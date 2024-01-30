/***
 * 2024-01-30
 * DYxTO
 * notes : https://www.geeksforgeeks.org/simple-calculator-using-tcp-java/
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class calculator2 {

    static String equals = " = ";
    static double result = -9999.9999;
    static String userInput;

    private static void printOp(){
        System.out.println("Choose from these operations: + - * /");
    }

    private static void getInput(){
        Scanner sc = new  Scanner(System.in);
        System.out.print("Enter expression in form [ operator term1 term2 ] : ");
        userInput = sc.nextLine();
        // System.out.println("User input: "+userInput);
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println();

        printOp();
        getInput();
        // System.out.println("User input: "+userInput);
        StringTokenizer st = new StringTokenizer(userInput);
        
        String operator =st.nextToken();
        int term1 = Integer.parseInt(st.nextToken());
        int term2 = Integer.parseInt(st.nextToken());

        System.out.println("Calculating...\n");
        // System.out.println(term1 + " " + operator + " " +term2 + equals + result);
        // System.out.println(operator);

        switch (operator) {
            case "+":
                result = term1 + term2;
                break;
            case "-":
                result = term1 - term2;
                break;
            case "*":
                result = term1 * term2;
                break;
            case "/":
                result = (double)term1 / term2;
                break;       
            default:
                System.out.println("Something went wrong.");
                break;
        }

        System.out.println(term1 + " " +operator +" " +term2 + equals + result);

        System.out.println();
    }
}
