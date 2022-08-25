public class Main{
    public static void main(String[] args) {
        int a = 100;
        float b = 100.0f;
        if(a==b){
            System.out.println("value of a is eqaul to value of b");
        }


        // if and else
        if(a>b){
            System.out.println("value of a is more than b");
        }
        else{
            System.out.println("value of b is more than a");
        }

        // if and else if
        if(a>b){
            System.out.println("value of a is more than b");
        }
        else if(b>a){
            System.out.println("value of b is more than a");
        }
        else{
            System.out.println("value of a is equal to b");
        }

    }     
}