import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPractice1 {

    public static void main(String[] args) {

        //Write a Java program to get the character at the given index within the string.
        //Write a Java program to get the character (Unicode code point) at the given index within the string.

        int index=0;
        Scanner sc = new Scanner(System.in);

        String orignal_string = new String("Java Exercises!");

        System.out.println("Enter -1 to exit");

        while (index!=-1) {
            System.out.print("Enter the index : ");
            index = sc.nextInt();

            if(index<orignal_string.length() && index>=0 ){

                char charter = orignal_string.charAt(index);
                int unicode_vale = orignal_string.codePointAt(index);
                System.out.println("The character at position "+index+" is "+charter + " Having Unicode value " + unicode_vale );
            }
            else System.out.println("Enter Valid index ");

        }




    }
}
