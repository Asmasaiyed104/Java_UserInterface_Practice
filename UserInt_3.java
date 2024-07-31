import java.util.Scanner;

public class UserInt_3 {

    /*
    How do you write a statement to let the user enter a double value from the
keyboard? What happens if you entered 5a when executing the following code?
double radius = input.nextDouble();
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius");

        double radius = sc.nextDouble();
    }
    // when you enter 5a will cause exception in thread because a is input mismatchException
}
