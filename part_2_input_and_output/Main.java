
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the roll number");
        // this will take int input only
        int roll_number = input.nextInt();
        System.out.println("roll number is: "+ roll_number);

        // this will take first word of the string
        String name = input.next();
        System.out.println("your name is: "+ name);

        // this will take the whole string
        String full_name = input.next();
        System.out.println("your name is: "+ full_name);

        // this will take float
        float marks = input.nextFloat();
        System.out.println("your marks is: "+ marks);
    }
}