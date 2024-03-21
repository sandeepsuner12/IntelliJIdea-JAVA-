package SchoolMeet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

class DPS extends School{
    public DPS(String name, int grade) {
        setName(name);
        setGrade(grade);
    }
}
class DC extends School{
    public DC(String name, int grade) {
        setName(name);
        setGrade(grade);
    }
}

public class Meet {

    public static void main(String[] args) {

       List<DPS> studentFromDPS= new ArrayList<>();

        studentFromDPS.add(new DPS("Ram",11));
        studentFromDPS.add(new DPS("Sham",12));


        List<DC> studentFromDC = new ArrayList<>();
        studentFromDC.add(new DC("Gita",12));
        studentFromDC.add(new DC("Mohan",10));


        List<List<? extends School>> meeting = List.of(studentFromDC,studentFromDPS);

        List<School> attendies = (List<School>) meeting.stream()
                .flatMap(List::stream)
                .toList();



    }
}

