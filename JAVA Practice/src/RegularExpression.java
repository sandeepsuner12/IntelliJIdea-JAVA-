public class RegularExpression {

    public static void main(String[] args) {

        String text="AY123";
        System.out.println(text.matches("[Y|A]*[0-9]*"));

        String email = "sandeepsuner@gmail.com";
        if(email.matches(".+@gmail.com"))  // here . checks any chartor eg -com 9com etc
        {
            String name,domain;
            int index = email.indexOf("@");
            name=email.substring(0,index);
            domain=email.substring(index+1);
            System.out.println("Name : " + name + " || Domain : " + domain);
        }


        //Number is binary or not??
        //Number is Hex-decimal or not??

        String numberString ="0011100001";
        //System.out.println(numberString);

        if(numberString.matches("[0-1]+")){
            System.out.println(numberString + " is Binary");
        } else if (numberString.matches("[0-9A-F]+")) {
            System.out.println(numberString + " is hexadecimal");
        }
        else {
            System.out.println("Nor binar nor hexadecimal");
        }

        //Find Data in date formatted dd/mm/yyyy and check format is correct or not;

        String date = "12/05/1999";

        if(date.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}")) {
            int first, second;
            first = date.indexOf("/");
            second = date.indexOf("/", first + 1);
            System.out.println("Day : " + date.substring(0, first));
            System.out.println("Month : " + date.substring(first + 1, second));
            System.out.println("Year : " + date.substring(second + 1));
        }


        //Replace/Remove all special character in string??

        String stringWithSymbols = "a@b#n!A^%$    455*&^%$66plkjj";

        System.out.println(stringWithSymbols.replaceAll("[^a-zA-Z0-9]",""));


        //Replace/Remove all extra Spaces in string

        String stringWithSpace = "   ram  sham  and  gopal     are  very    close    friends       ";
        String newString = stringWithSpace.replaceAll("\\s+"," ").trim();
        String[] words = newString.split("\\s");
        System.out.println(newString + " \"has\" " +words.length+ " words");




    }
}
