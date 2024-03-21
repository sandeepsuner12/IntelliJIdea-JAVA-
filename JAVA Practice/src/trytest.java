import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class trytest {


    public static void main(String[] args) {
        int []arr1 ={1,2,3};
        String[][] arr = { { "7", "6", "5" }, { "4", "3" }, { "2", "1" } };
        for (int i = 0; i < arr.length; i++) { //Line n1
            for (int j = 0; j < arr[i].length; j++) { //Line n2
                switch (arr[i][j]) { //Line n3
                    case "2":
                    case "4":
                    case "6":
                        break; //Line n4
                    default:
                        continue; //Line n5
                }
                System.out.println(arr[i][j]);;;;;;;;;; //Line n6


            }
        }


        int a = 2;
        a++;
        boolean res = false;
        res = a++ == 2
                || --a == 2
                && --a == 2;
        System.out.println(a);


        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(100);
        list.add(200);
        list.remove(new Integer(100));


        System.out.println(list);
        ArrayList<Integer> original = new ArrayList<>();
        original.add(new Integer(10));

        ArrayList<Integer> cloned = (ArrayList<Integer>) original.clone();


        int [] arr7 = {5, 10, 15};
        int [] arr8 = {'A', 'B'};
        arr7 = arr8;
        StringBuilder sb = new StringBuilder(5);
        sb.append("0123456789");
        sb.delete(8, 1000);
        System.out.println(sb);;

        int $ = 80000;
        System.out.println($);
        final int i1 = 1;
        final Integer i2 = 1;
        final String s1 = ":ONE";

        String str1 = i1 + s1;
        String str2 = i2 + s1;

        m(1);
        LocalDate date = LocalDate.of(2000, Month.JANUARY, 1);
        Period period = Period.parse("p-30000y");
        System.out.println(date.plus(period));

        LocalDate date1 = LocalDate.parse("2000-06-25");
        while(date1.getDayOfMonth() >= 20) {
            System.out.println(date1);
            date1=date1.plusDays(-1);
        }
        LocalDate joiningDate = LocalDate.parse("2006-03-16");
        System.out.println(joiningDate.withDayOfYear(29));

        System.out.println(str1 == "1:ONE");
        System.out.println(str2 == "1:ONE");

        String fruit = "mango";
        switch (fruit) {

            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
            default:
                System.out.println("ANY FRUIT WILL DO");
        }

    }
    private static void m(Object obj) {
        System.out.println("Object version");
    }

    private static void m(Number obj) {
        System.out.println("Number version");
    }

    private static void m(Double obj) {
        System.out.println("Double version");
    }
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
        }