Input and Output functions

Output functions : which gives output to the user
    - System.out.println("please enter the roll number") - this line will give output to user mentioned inside the bracket

Input function : which takes input from the user
    There a few points to keep in mind when working with input functions
        1. import the function
            from java.util.Scanner
        2. initialise the object of Scanner class 
            Scanner input = new Scanner(System.in)
        3. use created object to take user input
            int roll_number = input.nextInt()
