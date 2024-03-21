import java.util.Scanner;

public class GenerateNumberToWords {

    public static void main(String[] args) {

        float flag= 0;
        System.out.println("Enter -1 to exit :");

        while (flag!=-1) {
            String number, digits, decimal;
            System.out.print("Enter the number : ");
            Scanner sc = new Scanner(System.in);
            number = sc.next();

            if (number.matches("\\d*[.]{0,1}\\d*")) {

                if (number.indexOf('.') == -1) {
                    Long n = Long.parseLong(number);
                    digits = String.valueOf(n);
                    //decimal="";

                    System.out.println(CountingWordGenerator.generateInWords(digits));
                } else {
                    digits = number.substring(0, number.indexOf('.'));
                    decimal = number.substring(number.indexOf('.') + 1);

                    Long n = Long.parseLong(digits);
                    digits = String.valueOf(n);
                    char[] decimalCharArray = decimal.toCharArray();

                    System.out.print(CountingWordGenerator.generateInWords(digits) + " point");

                    for (int i = 0; i < decimal.length(); i++) {

                        if(decimalCharArray[i]=='0') {System.out.print(" Zero"); continue;}
                        System.out.print(" " + CountingWordGenerator.ones(decimalCharArray, i));

                    }
                    System.out.println();
                }

            } else System.out.println("Please Enter Numeric values only or positive number only");

            if(number.matches("[-]*\\d*[.]{0,1}\\d*"))  flag=Float.parseFloat(number);

        }



    }
}
