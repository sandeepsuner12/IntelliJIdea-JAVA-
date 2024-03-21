package InterfaceChallenges;

interface MemberInterface{
  void callback();
}

class Customer implements MemberInterface{

    String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void callback() {
        System.out.println("Ok ! I will come, Regards " + this.name);
    }
}

class Store{
    MemberInterface members[] = new MemberInterface[100];
    int count=0;

    void register(MemberInterface member)
    {
        members[count++]=member;
    }
    
    void inviteSale(){
        for (int i = 0; i < count; i++) {
            members[i].callback();
        }
    }


}


public class InterfaceStudentChallenge {

    public static void main(String[] args) {

        Store shop = new Store();
        Customer c1 = new Customer("Ram");
        Customer c2 = new Customer("Shaam");
        Customer c3 = new Customer("Mohan");
        shop.register(c1);
        shop.register(c3);

        shop.inviteSale();
    }
}
