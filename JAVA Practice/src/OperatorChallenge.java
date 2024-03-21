public class OperatorChallenge {

    public static void main(String[] args) {
        float base , height;
        base=3.4f;
        height=5.3f;

        System.out.println("Area Of triangle is :" + (base*height)/2);

        float side1=5f ,side2=6f, side3=7f , s;

        s=(side1+side2+side3)/2f;

        double area =Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        //area=s*(s-side1)*(s-side2)*(s-side3);
        System.out.println("Area Of triangle is :" + area);


        //Swap two numbers using Ex-Or

        int a=5,b=7;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a : " + a + " b : " + b);

        //Masking;

        byte c=0;

        c=(byte) (a<<4);
        c=(byte) (c| b);

        System.out.println("a : " + ((c&0b11110000)>>4) + " b : " + (c& 0b00001111));

    }
}
