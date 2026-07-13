import java.util.Scanner;

public class GradeClassifier {
    public static void main(String[] args){

        String grade;
        String remark;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your score (0-100):");
        int score = scanner.nextInt();

        if (score >= 90){
            grade = "A";
            remark = "Excellent! Keep it up!";
        }
        else if (score >= 80){
            grade = "B";
            remark = "Good work!";
        }
        else if (score >= 70){
            grade = "C";
            remark = "You passed!";
        }
        else if (score >= 60){
            grade = "D";
            remark = "Needs improvement.";
        }
        else {
            grade = "F";
            remark = "Please see your instructor.";
        }

        System.out.println("Grade  :" + grade);
        System.out.print("Remark :" + remark);
    }
    
}
