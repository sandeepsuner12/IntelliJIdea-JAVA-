import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class CustomSort {

    public static void main(String[] args) {

        List <Student> students = new ArrayList<>();

        students.add(new Student("Ram"));
        students.add(new Student("Shyam"));
        students.add(new Student("Gita"));
        students.add(new Student("Mohan"));
        students.add(new Student("Gabbar"));
        students.add(new Student("Gajni"));
        students.add(new Student("Sita"));
        students.add(new Student("Babita"));

//        System.out.println("Befor Sorting Names : ");
 //       students.forEach(name -> System.out.println(name));

        Collections.sort(students);

        System.out.println("After Sorting Names : ");

        // 1st For loop---->
        /*for (Student name: students) {
            System.out.println(name);
        }*/

        // 2nd For loop---->
        //students.forEach(name -> System.out.println(name));

        // 3rd For loop---->
        /*
        students.forEach(new Consumer<Student>() {
            @Override
            public void accept(Student student) {
                System.out.println(student);
            }
        });*/

        // 4ht For loop---->
       // students.forEach(new ConsumerImp());

        //5th for loop

        /*students.forEach(name -> {
                                    System.out.println(name);
                                     System.out.println("And Many More");
        });

         */
        //6th for loop
        //Method reference
        students.forEach(CustomSort::printName);
    }
    public static void printName(Student stu)
    {
        System.out.println(stu);
    }

}

