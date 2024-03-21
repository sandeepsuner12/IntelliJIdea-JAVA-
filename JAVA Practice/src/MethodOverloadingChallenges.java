import java.util.Arrays;

public class MethodOverloadingChallenges {

    public static double area(double length , double breadth )
    {
        return length*breadth;
    }

    public static double area(double radius){
        return 3.14d*radius*radius;
    }

    public static int reverse (int number){
        int reverseNumber = 0;

        while (number>0){

            reverseNumber=10*reverseNumber+number%10;
            number = number/10;
        }
        return reverseNumber;
    }

    public static void reverse (int[] array){
        for (int i = 0,j=array.length-1; i < j; i++,j--) {
            array[i]=array[i]^array[j];
            array[j]=array[i]^array[j];
            array[i]=array[i]^array[j];
        }
    }


    public static Integer maxOfVariableArguments(int...arguments)
    {
        int max;
        if(arguments.length>0) {
            max=arguments[0];
        }
        else return null;
        for (int value: arguments) {
            if(value>max) max=value;
        }
        return max;
    }

    public static int sumOfVariableArguments(int...arguments)
    {
        int sum=0;
        for (int value: arguments) {
            sum+=value;
        }
        return sum;
    }

    public static double discountOfVariableArguments(double ... arguments){
        double sum = Arrays.stream(arguments).sum();
        if(sum>100 && sum<999.9)
            return (sum/50); // 2% sum/100*2
        else if(sum<4999.9)
            return (sum/20);  //5% sum/100*5
        else if (sum<9999.9)
            return (sum/10);   //10% sum/100*10
        else return (sum/5);   //5% sum/100*20

        }



    public static void main(String[] args) {
        System.out.println(area(3.5d));
        System.out.println(area(5d,7d));
        System.out.println(reverse(54321));

        int array[]={5,4,3,2,1,0};

        reverse(array);
        for (int x: array) System.out.print(x+" ");

        System.out.println("\nmaximum is :" + maxOfVariableArguments(1,5,66,55,77,11,88));
        System.out.println("maximum is :" + maxOfVariableArguments(array));
        System.out.println("maximum is :" + maxOfVariableArguments());


        System.out.println("Sum is :" + sumOfVariableArguments(array));
        System.out.println("Sum is :" + sumOfVariableArguments(1,5,66,55,77,11,88));
        System.out.println("Sum is :" + sumOfVariableArguments());

        //System.out.println("Discount is :" + discountOfVariableArguments(array));
        System.out.println("Discount is :" + discountOfVariableArguments(1,5,66,55,77,11,88));
        System.out.println("Discount is :" + discountOfVariableArguments(5000));

    }
}
