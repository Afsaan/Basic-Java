import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number_1 = input.nextInt();
        int number_2 = input.nextInt();

        int sum = number_1 + number_2;
        System.out.println("sum of the two numbe is: "+ sum);

    }
}
