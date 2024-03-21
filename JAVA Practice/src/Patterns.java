public class Patterns {

    public static void main(String[] args) {
        //int[] a = new int[]{1, 2, 3, 4};
        int n = 5,i,j,k;

        for (i=0;i<n;i++)
        {
            for (j=0;j<n;j++)
            {
                if(j>=n-i-1)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print("_");
                }
            } System.out.println(" ");
        }

        System.out.println(" ");

        for (i=0;i<n;i++)
        {
            for (j=0;j<2*n-1;j++)
            {
                if(j>=n-i-1 && j <= n+i-1)
                {
                    System.out.print("*");
                }else
                {
                    System.out.print("_");
                }
            } System.out.println(" ");
        }
    }
}
