import java.util.Scanner;


public class calculator {
;

    static char equals = '=';
    static double result;

    private static void printOp(){
        System.out.println("Choose from these operations:\n1. +\n2. -\n3. *\n4. /\n");
    }
    

    // private static void doOperation(String userOp,int term1,int term2){
    //     if (userOp=="+") {
    //         result = term1+term2;
    //         System.out.println(term1 + userOp + term2 + equals + result);
    //     }else 
    //     if (userOp=="-") {
    //         result = term1-term2;
    //         System.out.println(term1 + userOp + term2 + equals + result);
    //     }else 
    //     if (userOp=="*") {
    //         result = term1*term2;
    //         System.out.println(term1 + userOp + term2 + equals + result);
    //     }else 
    //     if (userOp=="/") {
    //         result = term1/term2;
    //         System.out.println(term1 + userOp + term2 + equals + result);
    //     }else
    //     System.out.println("Ultimate Failure!\nRestart!\n");
    //     // return 0;
    // }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println();

            printOp();
            System.out.print("Enter an operation: ");
            String userOp = sc.next(); 
            // System.out.println("You chose: "+userOp);

            System.out.print("Enter a term: ");
            double term1 = sc.nextInt();
            // System.out.println("You chose: "+term1);

            System.out.print("Enter another term: ");
            double term2 = sc.nextInt();
            // System.out.println("You chose: "+term2);

            // doOperation(userOp,term1,term2);
            // printResult(term1, userOp, term2);

            switch (userOp) {
                case "+":
                    result = term1+term2;
                    break;
                    // case "1":
                    //     result = term1+term2;
                    //     break;
                case "-":
                    result = term1-term2;
                    break;
                    // case "2":
                    //     result = term1+term2;
                    //     break;
                case "*":
                    result = term1*term2;
                    break;
                    // case "3":
                    //     result = term1+term2;
                    //     break;
                case "/":
                    result = term1/term2;
                    break;
                    // case "4":
                    //     result = term1+term2;
                    //     break;
            
                default:
                System.out.println("Ultimate Failure!\nRestart!\n");
                    break;
            }

        
            System.out.println(term1 + userOp + term2 + " " + equals + " " + result);
           
            
            
        } catch (Exception e) {
            // user does not enter a number
            System.out.println("Something went wrong.\n");
        }
        
        sc.close();
    }
}
