public class MethodChallenge {


    public static boolean prime(int number)
    {
        for (int i = 2; i <= number/2; i++) {
            if(number%i==0) return false;
        }
        return true;
    }

    public static int gcd(int number1 , int number2){

        while (number1!=number2 )
        {
            if(number1>number2) number1-=number2;
            else  number2-=number1;
        }

        return number1;
    }

    public static void main(String[] args) {

        System.out.println(prime(13)?"Prime":"Not Prime");
        System.out.println(gcd(35,56));

    }
}
