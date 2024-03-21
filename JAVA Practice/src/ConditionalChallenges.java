import java.util.Scanner;

public class ConditionalChallenges {

    public static void main(String[] args) {

        //Find Radix of a given number
        System.out.println("Enter Number B / O /H :");
        Scanner sc = new Scanner(System.in);
        String number;
        number=sc.next();

        if(number.matches("[01]+"))
        {
            System.out.println("Binary -> radix : 2" );
        }
        else if (number.matches("[0-7]+"))
        {
            System.out.println("Octal -> radix : 8" );
        } else if (number.matches("[0-9A-F]+")) {
            System.out.println("Hexadecimal -> radix : 16" );
        }
        else System.out.println("Something Else");


        //leap year or not
         System.out.println("Year :");

        int year = sc.nextInt();

        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                {
                    System.out.println("Leap Year");
                }else System.out.println("Not a leap Year");
            }else System.out.println("Leap Year");
        }else System.out.println("Not a leap Year");

       //take domain from website

        String url = "http://www.google.com";

        int ind = url.lastIndexOf('.');
        String ext = url.substring(ind+1);

        String transferProtocol = url.substring(0,url.indexOf(":"));

        System.out.println("Extension : "+ext+ "  TP : "+transferProtocol);


    }
}
