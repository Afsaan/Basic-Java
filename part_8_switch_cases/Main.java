import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String fruits = in.next();

        switch(fruits){
            case "mango":
                System.out.println("king of fruits");
                break;
            case "orange":
                System.out.println("fruits name color is same");
                break;
            default:
                System.out.println("please enter the valid fruits");
        }
    }
}
