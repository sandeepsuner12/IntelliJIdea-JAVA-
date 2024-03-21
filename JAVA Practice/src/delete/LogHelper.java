package delete;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Student {
    private String name;
    private int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Student[" + name + ", " + age + "]";
    }

    public boolean equals(Object obj) {
        if(obj instanceof Student) {
            Student stud = (Student)obj;
            if(this.name.equals(stud.name) && this.age == stud.age) {
                return true;
            }
        }
        return false;
    }
}

public class LogHelper {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("James", 25));
        students.add(new Student("James", 27));
        students.add(new Student("James", 25));
        students.add(new Student("James", 25));

        students.remove(new Student("James", 25));
        LocalDate date = LocalDate.parse("2018-01-01");
        System.out.println(date);
        Boolean b1 = new Boolean("tRuE");
        Boolean b2 = new Boolean("fAlSe");
        Boolean b3 = new Boolean("abc");
        Boolean b4 = null;
        System.out.println(b1 + ":" + b2 + ":" + b3 + ":" + b4);
        add(10.0, 10);

        String [] arr = {"A", "ab", "bab", "Aa", "bb", "baba", "aba", "Abab"};

        processStringArray(arr,p->p.length()>=1);
        char c = 'Z';
        long l = 100_00l;
        int i = 9_2;
        float f = 2.02f;
        double d = 10_0.35d;
        l = c + i;
        f = c * l * i * f;
        f = l + i + c;
        i = (int)d;
        f = (long)d;

        StringBuilder sb = new StringBuilder("Java");
        String s1 = sb.toString();
        String s2 = "Java";

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1 == s2);

        m1(null);
        System.out.println("Output is: " + (10 != 5));
        for (Student stud : students) {
            System.out.println(stud);
        }
    }
    private static void processStringArray(String [] arr,
                                           Predicate<String> predicate) {
        for(String str : arr) {
            if(predicate.test(str)) {
                System.out.println(str);
            }
        }
    }
    static void m1(CharSequence s) {
        System.out.println("CharSequence");
    }

    static void m1(String s) {
        System.out.println("String");
    }

    static void m1(Object s) {
        System.out.println("Object");
    }
    private static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }
}




