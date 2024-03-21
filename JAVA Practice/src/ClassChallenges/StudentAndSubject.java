package ClassChallenges;

import java.util.Date;

class Subject{
    private String subID , name;
    private float maxMarks,marksObtain;

    public Subject(String subID,String name){
        this.subID=subID;
        this.name=name;
    }
    public Subject(String subID,String name,float maxMarks , float marksObtain){
        this.subID=subID;
        this.name=name;
        this.maxMarks=maxMarks;
        this.marksObtain=marksObtain;
    }

    public void setMaxMarks(float maxMarks) {
        this.maxMarks = maxMarks;
    }

    public void setMarksObtain(float marksObtain) {
        this.marksObtain = marksObtain;
    }

    public String getName() {
        return name;
    }

    public String getSubID() {
        return subID;
    }

    public float getMaxMarks() {
        return maxMarks;
    }

    public float getMarksObtain() {
        return marksObtain;
    }
    public String toString(){
        return "\nSubject ID : "+subID+"\nName : "+name+"\nmax Marks : "+maxMarks+"\nMarks "+marksObtain;
    }

}

class Student{
    private final String rollNumber;
    //String roll
    public static int counter=1;
    private String name,department;
    private Subject[] subjects;

    private  String genrateRoolNo(){
        Date d = new Date();
        return "Medi-"+(d.getYear()+1900)+"-"+counter++;

    }

    public Student (){
        System.out.println(rollNumber=genrateRoolNo());
    }

    public Student(String rollNumber ,String name , String department){
        this.rollNumber=rollNumber;
        this.name=name;
        this.department=department;
    }

    public void setSubjects(Subject...subjects) {
        this.subjects = new Subject[subjects.length];
        for (int i=0 ; i<subjects.length ; i++)
        {
            this.subjects[i]=new Subject(subjects[i].getSubID(),subjects[i].getName(),
                    subjects[i].getMaxMarks(),subjects[i].getMarksObtain());
        }
    }
    public String getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

public class StudentAndSubject {
    public static void main(String[] args) {

        Subject[] obj;
        obj = new Subject[3];
        obj[0]=new Subject("S01", "DS" , 100 , 92 );
        obj[1]=new Subject("S02", "DAA" , 100 , 52 );
        obj[2]=new Subject("S03", "DSE" , 100 , 99 );

        /*Student stu = new Student("101" ,"Ram" , "Engineering");
        stu.setSubjects(obj[0] ,obj[1]);
        obj[1].setMarksObtain(99);

        Student stu1 = new Student("101" ,"Ram" , "Engineering");
        stu1.setSubjects(obj[2] ,obj[1]);

        for (Subject sub : stu.getSubjects()) {
            System.out.println(sub);
        }

        for (Subject sub : stu1.getSubjects()) {
            System.out.println(sub);
        }
        *//*for (Subject ob:obj) {
            System.out.println(ob);
        }*/
        Student stu = new Student();
        Student stu1 = new Student();
        Student stu2 = new Student();
    }
}
