import java.util.Scanner;
public class occurance {
    public static void main(String[] args) {
        System.out.println("count the number of occurance of a given number");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number ");
        int sequence = input.nextInt();

        System.out.println("Enter the number to be counted: ");
        int number = input.nextInt();

        int count = 0;

        while(sequence>0){
            int solo_number = sequence % 10;
            if(solo_number==number){
                count++;
            } 
            sequence = sequence/10;
        }

        System.out.println(number+" is repeated for "+count+" times");

    }
}
