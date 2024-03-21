package LambdaExpression;

@FunctionalInterface
interface InterfaceForMethodReference{

    String interfaceMethod(int number , boolean flag);
}

class ClassWithOtherMethod{

    public static String otherMethod(int value , boolean mark){

        System.out.println("We can Do anything with any line of code and We can also use passed value like "+ value + mark);

        return "This is another Method with same PARAMETERS and RETURN TYPE as Method in Functional Interface";
    }

}


public class MethodReference {

    public static void main(String[] args) {

        InterfaceForMethodReference ref = ClassWithOtherMethod::otherMethod;

        System.out.println(ref.interfaceMethod(5,true));

        //If return type of interface method is void then we can also give the reference of a constructor eg
        // InterfaceForMethodReference ref = ClassWithOtherMethod::new;
        

    }
}
