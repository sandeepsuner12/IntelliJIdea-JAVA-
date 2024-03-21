import java.util.Scanner;

public class LoopChallenge2 {

    public static void main(String[] args) {

        //Print AP Series
        Scanner sc = new Scanner(System.in);
        int a,d,n,value;

        System.out.println("Enter first term(a) , differance(d) , and number of terms for AP ");
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        value=a;
        System.out.print(a + " ");
        for (int i=1; i<n ; i++)
        {
            value=value+d;
            System.out.print(value+" ");
        }

        System.out.println();
        System.out.println("Enter first term(a) , common ratio (r) , and number of terms for GP ");

        int r;
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        value=0;
        for (int i=0; i<n ; i++)
        {
            value=a*(int)Math.pow(r,i);
            System.out.print(value+" ");
        }

        System.out.println("Enter number of terms for fibonacci  ");
        n = sc.nextInt();
        int prev =0 , current=1 , sum;

        for (int i =1 ; i<=n ; i++)
        {
            if(i==1) System.out.print(prev + " ");
            if(i==2) System.out.print(current+ " ");

            sum=prev+current;
            prev=current;
            current=sum;
            System.out.print(sum+ " ");
        }
    }
}
