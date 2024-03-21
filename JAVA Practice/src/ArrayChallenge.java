import java.util.Scanner;

public class ArrayChallenge {

    public static void main(String[] args) {

        //find sum of a array
        // search given element from the array;
        // find min element of a array
        // find max element of a array
        // find second max element of array

        int A[] = {101,2,3,4,5,6,55,88,99,101,55,89,77};
        Scanner sc = new Scanner(System.in);

        int sum=0, max=Integer.MIN_VALUE,min=Integer.MAX_VALUE,element,secondMax;
        boolean flag=false;


        for (int value: A) sum+=value;
        System.out.println("Sum of the array is : " + sum);

        // search given element from the array;

        System.out.print("Enter the element you want to search in array : ");
        element = sc. nextInt();

        for (int i =0 ; i<A.length ; i++)
        {
            if(A[i]==element) {
                System.out.println("element "+ element +" is present at index " + i);
                flag=true;
            }
        }

        if (!flag) System.out.println("element not found ");

        // find min element of a array
        // find max element of a array

        for (int value : A) {
            if(value>max) max = value;
            if(value<min) min = value;
        }
        System.out.println("Max element of the array : " + max +"\nMin element of the array is : " + min);

        // find second max element of array

        max=0;
        secondMax = 0;
        for (int value : A) {
            if(value>max){
                secondMax=max;
                max=value;
            }
            else if(value>secondMax && value!=max) secondMax=value;

        }
        System.out.println("Second max is : " + secondMax);


      /*  int B[] = {101,2,3,4,5,6,55,88,99,100,55,89,77};
        int max , secondMax;
        max=B[0];
        secondMax = B[0];
        for (int i=0; i<B.length ; i++) {
            if(i!=B.length-1)
            {
                if(B[i+1]>max) max=B[i+1];
            }
            if(B[i]!=max  && B[i]>secondMax )
                secondMax=B[i];
            if(secondMax==max)

        }*/
        //System.out.println("Second max is : " + secondMax);


    }
}
