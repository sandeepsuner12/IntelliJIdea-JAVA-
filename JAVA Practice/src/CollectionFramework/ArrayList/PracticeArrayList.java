package CollectionFramework.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class PracticeArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        ArrayList<Integer> integerArrayList1 = new ArrayList<>(List.of(10,20,30,40,50,60));

        integerArrayList.add(0);
        integerArrayList.add(0,1);

        integerArrayList.addAll(integerArrayList1);
        System.out.println(integerArrayList);

        integerArrayList.addAll(5,integerArrayList1);
        System.out.println(integerArrayList);

        integerArrayList.retainAll(integerArrayList1);
        System.out.println(integerArrayList);

        System.out.println(integerArrayList.subList(5,7));

        integerArrayList1.addAll(0,integerArrayList.subList(5,7));
        System.out.println(integerArrayList1);

        Iterator<Integer> it = integerArrayList.iterator();

        ListIterator<Integer> lit = integerArrayList.listIterator();

        for ( ; lit.hasNext();){
            //Integer x = lit.next();
            //System.out.println(x);

            System.out.println(lit.next());
        }




    }
}
