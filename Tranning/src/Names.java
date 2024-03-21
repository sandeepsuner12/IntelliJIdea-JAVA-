import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Names {

    public static void main(String[] args) {
        Set<Student> students = new HashSet<>();
        List names = new ArrayList();

        students.add(new Student("Ram"));
        students.add(new Student("Sham"));
        students.add(new Student("Mohan"));
        students.add(new Student("Ram"));
        students.add(new Student("Sham"));
        students.add(new Student("Mohan"));

       /*for (Student obj : students) {

            System.out.println(obj);
        }*/


        //System.out.println("End");


         }

}
