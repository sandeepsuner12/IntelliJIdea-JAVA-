import java.util.Scanner;

public class LoopChallenge {


    public static void main(String[] args) {

        // Find Factorial of a number
        int number,factorial=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to find factorial : ");
        number = sc.nextInt();

        for (int i =1 ; i<=number ; i++ )
            factorial *= i;

        System.out.println(factorial);

        //display digits
        //count number of digits
        //revers the number
        //Armstrong and palindrome number or not

        System.out.println("Enter the Number to find number of digits, it's reverse and it is Palindrome or not: "); ///123321
        int count =0, reverse=0 ,armstrong=0;
        number=sc.nextInt();
        int check=number;
        while (number>0)
        {
         count++;
         reverse=(reverse*10)+(number%10);
         number=number/10;
        }

        System.out.println("Number of digits : " +count+ "\nReverse of number : " +reverse);
        if(reverse==check)
        {
            System.out.println(check +" is a Palindrome number");
        }
        else System.out.println(check +" is Not Palindrome number");

        System.out.println("Enter the Number to find number is Armstrong or not: ");  //1634
        number=sc.nextInt();
        check=number;
        count=0;

        while (number>0)
        {
            count++;
            number=number/10;

        }
        number=check;
        while (number>0)
        {
            armstrong = armstrong + (int)Math.pow(number%10,count);
            number=number/10;
        }
        if(armstrong==check)
        {
            System.out.println(check +" is a Armstrong number");
        }
        else System.out.println(check +" is Not a Armstrong number");





    }
}
