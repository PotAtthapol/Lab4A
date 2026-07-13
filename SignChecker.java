import java.util.Scanner;

public class SignChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String Sign;

        System.out.print("Enter a number:");
        double number = scanner.nextDouble();

        if (number < 0){
            Sign = "Negative";
        }
        else if (number == 0){
            Sign = "Zero";
        }
        else{
            Sign = "Positive";
        }

        System.out.println("Sign          :" + Sign);
        System.out.print("Absolute Value:" + Math.abs(number));
    }
    
}
