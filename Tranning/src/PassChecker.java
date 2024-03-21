public class PassChecker {
    private String id;

    public PassChecker(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {

        System.out.println(this.id +" Acces Denied");

        if(obj==null)
        {
            return false;
        }
        if(!(obj instanceof PassChecker))
        {return false;}
        //System.out.println("Method");
        PassChecker other = (PassChecker) obj;
        return this.id.equals(other.id);
    }

    @Override
    public int hashCode() {
        //System.out.println("hashcode method");
        //System.out.print(id + " ");

        return this.id.hashCode();

    }

    @Override
    public String toString() {
        return this.id;
    }
}
