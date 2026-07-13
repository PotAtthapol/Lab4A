import java.util.Scanner;

public class BMICalc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String category;

        System.out.print("Enter weight (kg):");
        Double weight = scanner.nextDouble();
        System.out.print("Enter height (m):");
        Double height = scanner.nextDouble();

        Double bmi = weight / (height * height);
        if (bmi >= 30){
            category = "Obese";
        }
        else if (bmi >= 25){
            category = "Overweight";
        }
        else if (bmi >= 18.5){
            category = "Normal";
        }
        else {
            category = "Underweight";
        }
        System.out.println("BMI    :" + bmi);
        System.out.print("Category  :" + category);


    }
    
}
