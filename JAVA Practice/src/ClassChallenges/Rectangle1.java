package ClassChallenges;

class Rectangle {

    private int length , breadth ;

    public int area() {return length*breadth;}
    public int perimeter(){return 2*length+2*breadth;}

    public boolean isSquare(){
        return length==breadth?true:false;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }


}

public class Rectangle1{

    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.setLength(3);
        re.setBreadth(3);
        System.out.println("Area : " +re.area());
        System.out.println("Perimeter : "+ re.perimeter());
        System.out.println(re.isSquare());
    }
}
