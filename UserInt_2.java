import java.util.Scanner;

public class UserInt_2 {
    public static void main(String[] args) {


        // it will create Scanner object
        Scanner sc = new Scanner(System.in);

        // prompt the user to enter three numbers
        System.out.println("Enter three numbers:");

        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double num3 = sc.nextDouble();

        // compute average of double  "avg"

        double avg = (num1 + num2 + num3)/3;

        // display the result of avg
        System.out.println("The average of " +  avg);



    }
}
