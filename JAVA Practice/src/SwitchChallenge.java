import java.util.Scanner;

public class SwitchChallenge {

    public static void main(String[] args) {

        int number1 , number2 ;
        String operation;

        Scanner sc = new Scanner(System.in);
        System.out.println("Options\n ADD \n SUB \n MUL \n DIV");
        System.out.println("Enter Two Numbers : ");
        number1=sc.nextInt();
        number2=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option ");
        operation=sc.nextLine();
        //System.out.println(operation);

        switch (operation){
            case "ADD":
                System.out.println(number1+number2);
                break;
            case "SUB":
                System.out.println(number1-number2);
                break;
            case "MUL":
                System.out.println(number1*number2);
                break;
            case "DIV":
                System.out.println(number1/number2 +"."+(number1%number2));
                break;
            default:
                System.out.println("Worng Input");
                break;
        }
    }
}
