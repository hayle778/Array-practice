import java.util.Scanner;

public  class Myapp {
    public static void main (String[] args) {
        Scanner input = new Scanner( System.in );

        int sum = 0, usrNo;


        System.out.println( "Enter a number" );
        usrNo = input.nextInt();
        input.nextLine();

        int intArray[] = {1,2,3,4,5,6,7,8,9,10};

        sum = 0;
        for (int i = 0; i < 10; i++) ;   // initalize your userNo and prompt the input
        System.out.println( "sum of a number:" ); // print out the sum of all intger
        intArray [10] = input.nextInt(); // declare the integer array
        sum += intArray[10];
        input.nextLine();


    }
}

