package LambdaExpression;

import java.util.Random;

@FunctionalInterface
interface MylambdaInerface{
    void display();
}

/*class MyClass implements MylambdaInerface{

    @Override
    public void display() {
        System.out.println("Hello");
    }
}*/
public class FistLambdaExp {

    public static void main(String[] args) {
        /*MylambdaInerface m = new MyClass();
        m.display();
*/
       /* MylambdaInerface m = new MylambdaInerface() {
            @Override
            public void display() {
                System.out.println("Hello");
            }
        };*/

       /* MylambdaInerface m = ()-> {
                System.out.println("Hello");
        };   or */

        MylambdaInerface m = ()-> System.out.println("Hello");


        m.display();

    }
}
