public class Student implements Comparable<Student> {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println(obj);
        if(obj==null)
        {
            return false;
        }
        if(!(obj instanceof Student))
        {return false;}

        Student other = (Student) obj;
        return this.name.equals(other.name);
    }

    @Override
    public int hashCode() {
        //System.out.println("hashcode method");
        //System.out.println(this.name.hashCode());
        //System.out.println(this.name.hashCode());

        return this.name.hashCode();

    }



  @Override
    public String toString() {
        return this.name;
    }

    @Override
    public int compareTo(Student other) {
        return this.getName().compareTo(other.getName());
    }
}
