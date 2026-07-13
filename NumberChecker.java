import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 2 == 0){
            System.out.println("HiFive!");
            System.out.println("HiEven!");
        }
        else if (number % 5 == 0){
            System.out.println("HiFive!");
        }
        else if (number % 2 == 0){
            System.out.println("HiEven!");
        }
        else{
            System.out.println("Ordinaty Number");
        }

    }
    
}
