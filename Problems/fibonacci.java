import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Fibonacci Series");

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of series you want");
        int sequence = input.nextInt();

        int first_value = 0;
        int second_value = 1;
        int temp = 0;

        for (int i=0; i<=sequence; i++){
            temp = first_value + second_value;
            first_value = second_value;
            second_value = temp;
        }

        System.out.println("final ouput"+ temp);

    }
}
