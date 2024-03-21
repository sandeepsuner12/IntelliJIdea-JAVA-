
public class CountingWordGenerator {

    public static String ones(char[] number, int index){


        if(number[index]=='0' && number.length==1)  //return zero only for "0"    not for 100 (One hundred zero)
        {
            return "Zero";
        }

        return switch (number[index]) {
            case '1' -> "one";
            case '2' -> "two";
            case '3' -> "three";
            case '4' -> "four";
            case '5' -> "five";
            case '6' -> "six";
            case '7' -> "seven";
            case '8' -> "eight";
            case '9' -> "nine";
            default -> "";       //return nothing when 0 is present of ones place e.g. 1010 -> one thousand ten||not one thousand __something__ ten
        };
    }

    public static String tens(char[] number , int index){
        if(number[index]=='0'){       //check ones place when leading digit is zero eg (01,09)  || 101101(one lakh one thousand one hundred one)
           return ones(number,index+1);
        }
        else if (number[index]=='1'){      //checks and words for number b/w 10 to 19
            switch (number[index + 1]) {
                case '0':
                    return "ten";
                case '1':
                    return "eleven";
                case '2':
                    return "twelve";
                case '3':
                    return "thirteen";
                case '4':
                    return "fourteen";
                case '5':
                    return "fifteen";
                case '6':
                    return "sixteen";
                case '7':
                    return "seventeen";
                case '8':
                    return "eighteen";
                case '9':
                    return "nineteen";
            }
        }
        return switch (number[index]) {
            case '2' -> "twenty " + ones(number, index + 1);
            case '3' -> "thirty " + ones(number, index + 1);
            case '4' -> "forty " + ones(number, index + 1);
            case '5' -> "fifty " + ones(number, index + 1);
            case '6' -> "sixty " + ones(number, index + 1);
            case '7' -> "seventy " + ones(number, index + 1);
            case '8' -> "eighty " + ones(number, index + 1);
            case '9' -> "ninety " + ones(number, index + 1);
            default -> "";
        };
    }

    public static String hundreds(char[] number , int index){
        if(number[index]=='0'){                //checks for value where hundreds place is zero eg(1011,5055,786044)
            return tens(number,index+1);
        }
        else {
            return ones(number,index)+" hundred " + tens(number,index+1);
        }
    }

    public static String thousand(char[] number,int index)
    {
        if(number.length==4)    //checks values below 10 thousand
        {
            return ones(number,index) +" thousand " + hundreds(number,index+1);
        }
        else return tens(number,index) +" thousand " + hundreds(number,index+2);
    }

    public static String lakhs(char[] number, int index)
    {
        if(number.length==6)  //checks values below 10 lakh
        {
            return ones(number,index) +" lakh " + thousand(number,index+1);
        }
        else return tens(number,index) +" lakh " + thousand(number,index+2);
    }


    public static String generateInWords(String digits)
    {
        char[] number = digits.toCharArray();
        //System.out.println(number);


         if (number.length == 1)  return ones(number, 0);
        else if (number.length == 2) return tens(number, 0);
        else if (number.length == 3) return hundreds(number, 0);
        else if (number.length <= 5) return thousand(number, 0);
        else if (number.length <= 7) return lakhs(number, 0);
        else return "Please Enter Up to 7 digits only";
    }

   /* public static String generateDecimalToWords(String decimals)
    {
        char[] number = decimals.toCharArray();
        //System.out.println(number);

        String value = null;
        for(int i=0; i<decimals.length();i++){
           value = " "+ ones(number,i);
        }


        return value;
    }*/



 /*   public static void main(String[] args) {

        int inputNumber=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter -1 to exit");

        while (inputNumber!=-1) {
            System.out.print("Enter the number : ");
            inputNumber = sc.nextInt();

            char[] number = String.valueOf(inputNumber).toCharArray();
            //System.out.println(number);

            if (inputNumber < 0 || inputNumber > 9999999) System.out.println("Please enter valid number");
            else if (number.length == 1) System.out.println(ones(number, 0));
            else if (number.length == 2) System.out.println(tens(number, 0));
            else if (number.length == 3) System.out.println(hundreds(number, 0));
            else if (number.length <= 5) System.out.println(thousand(number, 0));
            else if (number.length <= 7) System.out.println(lakhs(number, 0));

        }

    }*/
}
