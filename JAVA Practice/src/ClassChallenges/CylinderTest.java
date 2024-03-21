package ClassChallenges;

class Cylinder{

    private double radius , height;

    public Cylinder()
    {
        this.radius=0;
        this.height=0;
    }
    public Cylinder(double radius)
    {
        this.radius=radius;
        this.height=1;
    }
    public Cylinder(double radius,double height)
    {
        this.radius=radius;
        this.height=height;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius > 0 ? radius : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0 ;
    }

    public void setDimensions(double height,double radius) {
        this.height = height > 0 ? height : 0 ;
        this.radius = radius > 0 ? radius : 0;
    }
}
public class CylinderTest {
}
