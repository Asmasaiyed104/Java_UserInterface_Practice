import java.util.Scanner;

public class UserInt_4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter int for scnds");

        int seconds = sc.nextInt();

        int minutes = seconds /60;

        int remainsc = seconds % 60;

        System.out.println("Minute is: " + minutes + ", Remaining sec is: " + remainsc  );

       // Exponent a rest to b
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(4,0.5));
        System.out.println(Math.pow(2.5,2));
        System.out.println(Math.pow(2.5,-2));
     // show the result of remainer

        System.out.println(65 % 6);
        System.out.println(78 % -4);
        System.out.println(-34 % 5);
        System.out.println(-34 % -5);
        System.out.println(5 % 1);
        System.out.println(1 % 5);
     //What is the result of 25 / 4? How would you rewrite the expression if you wished
        //the result to be a floating-point number?

        float num = 25f;
        float div = num/4;
        System.out.println("float num is: " + div);



        // If today is Tuesday, what will be the day in 100 days?

        String [] arrayOfWeek ={"Sun", "Mon", "Tue","Wed","Thr","Fri","Sat"};
         int currentday = 2;
         int days = 100;

         int findDay = (currentday + days) % 7;

        System.out.println("the day will be in 100 days is: " + findDay);

        //Show the result of the following code:
        System.out.println(2 * (5 / 2 + 5 / 2));
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);

        //Write a statement to display the result of 23.5.

        System.out.println(Math.pow(2,3.5));

        // output
        int a = 6;
        int b = a++;
        System.out.println(a);
        System.out.println(b);
        a = 6;
        b = ++a;
        System.out.println(a);
        System.out.println(b);

    }
}
