public class ArrayChallenge2 {
    public static void main(String[] args) {
              // rotate array
        int[] array = {0,1,2,3,4,5,6,7,8,9};
        int temp;
        /*
        temp=array[0];
        for (int i=0 ; i<array.length ; i++)
        {

            if(i==array.length-1) array[i]=temp;
            else array[i]=array[i+1];
        }*/

        temp=array[array.length-1];
        for (int i=array.length-1 ; i>=0 ; i--)
        {
            if(i==0) array[i]=temp;
            else array[i]=array[i-1];
        }

        for (int value: array) {
            System.out.print(value+" ");
        }
        System.out.println();
        //insert element in array;

        int[] array1 = new int[10];
        array1[0]=1;
        array1[1]=2;
        array1[2]=3;
        array1[3]=4;
        array1[4]=6;
        array1[5]=7;
        for (int x: array1) {
            System.out.print(x+" ");
        }
        System.out.println();
        /*
        int numberOfElement=6,index=4,value=5;


        for (int i=numberOfElement+1 ; i>index ; i--) {
            array1[i]=array1[i-1];
        }
        array1[index]=value;

         */


        int numberOfElement=6,index=0;

        for (int i=index ; i<numberOfElement-1 ; i++) {
            array1[i]=array1[i+1];
        }
        array1[numberOfElement-1]=0;
        for (int x: array1) {
            System.out.print(x+" ");
        }

    }
}
