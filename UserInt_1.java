
import java.util.Scanner;

public class UserInt_1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int i = 21;

        if(i <= 20) {
            int num = scanner.nextInt();
            System.out.println("you enter any number");
        } else {
            String str = scanner.nextLine();
            System.out.println("enter your string");
        }
    }



}
