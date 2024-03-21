public class TryCatch {


    public static void method() throws Exception
    {
        throw new Exception("My Exception");
    }


    public static void main(String[] args) throws Exception {

        /*try {
            System.out.println(1/0);
        }catch (Exception e)
        {
            //e.getStackTrace(System.in);
            e.printStackTrace(System.out);
        }*/
        /*int A[]={0,1,2,3};
        try {
            System.out.println(A[6]);
            System.out.println(A[1]/A[0]);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            //e.getStackTrace(System.in);
            e.printStackTrace(System.out);
        }catch (ArithmeticException e)
        {
            //e.getStackTrace(System.in);
            e.printStackTrace(System.out);
        }
        System.out.println("Bye");*/
        method();

    }
}

