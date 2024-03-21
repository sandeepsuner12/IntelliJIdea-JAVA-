abstract class Shape{
    abstract float perimeter();
    abstract float area();
}
class Circle extends Shape{

    public Circle(int radius){
        this.radius=radius;
    }


    int radius;
    float perimeter(){
        return (float) (3.14*2*radius);
    }

    @Override
    float area() {
        return (float) (3.14*radius*radius);
    }

    void display(){
        System.out.println("I am circle");
    }

}

class Rectangle extends Shape{

    int length , breath;

    public Rectangle(int length, int breath) {
        this.length = length;
        this.breath = breath;
    }

    float perimeter(){
        return (2*length)+(2*breath);
    }

    @Override
    float area() {
        return length*breath;
    }

    void display(){
        System.out.println("I am circle");
    }

}


public class AbstractStudentChallenge {
    public static void main(String[] args) {

        //Shape cr = new Circle(5);
        Circle cr = new Circle(5);
        System.out.println(cr.area());
        System.out.println(cr.perimeter());
        //System.out.println(cr.display());


    }
}
