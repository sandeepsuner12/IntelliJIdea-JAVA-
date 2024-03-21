public class MyFuntions {

    public int power(int base,int exponent)
    {
        int result=1;

        while(exponent != 0)
        {
            result = result * base;
            exponent--;
        }

        return result;
    }

    public double power(double base,int exponent)
    {
        double result=1;

        while(exponent != 0)
        {
            result = result * base;
            exponent--;
        }

        return result;
    }

    public int factorial(int number)
    {
        int result=1;

        if(number<0){
            return -1;
        }
        else {
            for(int i=1 ; i<=number ; i++)
            {
                result = result * i;
            }
        }
        return result;
    }


}
