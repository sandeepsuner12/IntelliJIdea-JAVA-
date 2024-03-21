public class StringPractice2 {

    public static void main(String[] args) {
        //Write a Java program to compare two strings lexicographically.

        String first = "This is Exercise 1";
        String second = "This is Exercise 2";

        int result = first.compareTo(second);

        if(result==0){
            System.out.println(first +" is equals to " + second);
        } else if (result>0) {
            System.out.println(first +" is grater than " + second);
        }
        else {
            System.out.println(first +" is less than " + second);
        }

        //Write a Java program to test if a given string contains the specified sequence of char values.

        String text = "PHP Exercises and Python Exercises";
        String sequence = "and";

        if(text.indexOf(sequence)>0)  //text.contains(sequence)
        {
            System.out.println(text +" has "+ sequence +" in it");
        }
        else System.out.println("False");


        //Write a Java program to check whether a given string ends with another string.

        String email = "www.sandeepsuner@gamil.com";
        String ends_with = ".com";

        if(email.endsWith(ends_with))
        {
            System.out.println(email +" ends with "+ ends_with);
        }
        else System.out.println("False");


        //Write a Java program to compare a given string to another string, ignoring case considerations.

        String  string1 = "SANDEEP SUNER";
        String string2 = "Sandeep Suner";

        if(string1.equalsIgnoreCase(string2))
        {
            System.out.println(string1 +" equals to "+ string2 +" if case is ignored");
        }
        else System.out.println("False");

        //Write a Java program to replace a specified character with another character.

        String  sentence = "The quick brown fox jumps over the lazy dog.";
        System.out.println(sentence.replace("dog","cat"));



    }
}
