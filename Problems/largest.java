import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        // taking the 3 user input

        Scanner input = new Scanner(System.in);

        System.out.println("enter the first number");
        int a = input.nextInt();

        System.out.println("enter the second number");
        int b = input.nextInt();

        System.out.println("enter the third number");
        int c = input.nextInt();
        // 1st way
        if (a > b && a >c ){
            System.out.println("value of a is largest" + a);
        }
        else if(b > a && b >c ){
            System.out.println("value if b is largest" + b);
        }
        else{
            System.out.println("value of c is largest" + c);
        }


        // 2nd way - efficient
        int max = a;
        if(b>max){
            max = b;
        }
        if(c>max){
            max = c;
        }
        System.out.println(max);

    }
    
}
