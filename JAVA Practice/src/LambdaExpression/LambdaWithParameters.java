package LambdaExpression;

@FunctionalInterface
interface Addition{
    int add(int a , int b);
}

public class LambdaWithParameters {

    public static void main(String[] args) {
        //Addition ad = (number1 , number2)->{return number1+number2;};
        Addition ad = (number1 , number2)-> number1+number2;
        //Addition ad = Integer::sum;

        System.out.println(ad.add(5,4));
    }
}
