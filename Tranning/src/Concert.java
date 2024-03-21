import java.util.HashSet;
import java.util.Set;

public class Concert {

    public static void main(String[] args) {



        Set<PassChecker> tickets = new HashSet<>();

        tickets.add(new PassChecker("A101"));
        tickets.add(new PassChecker("A102"));
        tickets.add(new PassChecker("A103"));
        tickets.add(new PassChecker("A102")); //2
        tickets.add(new PassChecker("A104"));
        tickets.add(new PassChecker("A105"));
        tickets.add(new PassChecker("A106"));
        tickets.add(new PassChecker("A101")); //1
        tickets.add(new PassChecker("A107"));

        //System.out.println("Checkk");
        tickets.add(new PassChecker("A106")); //6
        tickets.add(new PassChecker("A108"));
        tickets.add(new PassChecker("A109"));
        tickets.add(new PassChecker("A107")); //7
    }
}
