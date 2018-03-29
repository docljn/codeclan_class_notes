import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

//        IF ELSE STATEMENT
        int x = 30;

        if( x > 20 ){
            System.out.println("This is an if statement.");
        } else if (x == 30) {
            System.out.println("This is the else if part.");
        } else (????) {
            System.out.println("This is the else part.");
        }

////        IF STATEMENT
        int x = 10;
        if( x == 10 ) {
            System.out.println("Maths's working!");
        }



//        COMPARING REFERENCE TYPES

        System.out.println("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
////        accepts input from the terminal
        String name = scanner.nextLine();
////        reads something from the terminal
////        this is stored in a different memory location to a variable which is just set in the method
////        TO COMPARE THE VALUE OF TWO STRINGS (or other reference types) use the .equals() METHOD
        System.out.println(name == "Colin Bell");
        System.out.println(name.equals("Colin Bell"));


//        SWITCH STATEMENT

//
        char grade = 'C';

        switch(grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
////                if it matches, break out immediately
            case 'B':
                System.out.println("Great.");
                break;
            case 'C':
                System.out.println("Well done.");
                break;
            default:
                System.out.println("Invalid grade.");


////        WHILE LOOP
////        ***will not be run at all if the condition is not met
//
//
        int x = 10;

        while(x < 20) {
            System.out.println("Value of x is: " + x);
            x++;
            System.out.println("\n");


////        DO WHILE LOOP
////        ***WILL ALWAYS BE EXECUTED ONCE EVEN IF THE CONDITIONAL IS NOT MET
//
        int x = 30;

        do {
            System.out.println("Value of x: " + x);
            x++;
        } while(x < 20);


//        FOR LOOP
//        NB> you don't need an array to run a for loop, although you can run a for loop on an array

//        for (initialization, boolean expression, update){}
//          initialization is called once at the start of the function
//          boolean is checked at the start of each loop through
//          update is done at the end of each loop through

        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");
        words.add("Orange");
        words.add("Dragonfruit");

        for (int i = 10; i < 20; i++){
            System.out.println(i);
        }

        //        can loop through array, using index numbers

        for (int i = 0; i < words.size(); i++){
            System.out.println(words.get(i));
        }

        //        for each loop

        for (String word: words) {
            System.out.println(word);
        }


    }
}


