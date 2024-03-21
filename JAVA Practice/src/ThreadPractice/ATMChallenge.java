package ThreadPractice;

class ATM{



     synchronized public  void checkBalance(String name){
        System.out.print(name +" is Checking ");
        try {
            Thread.sleep(1000);
        }catch (Exception ignored){}
        System.out.println("balance");
    }
     synchronized public  void Withdraw(String name , double amount){
        System.out.println(name +" is Withdrawing ");
        try {
            Thread.sleep(1000);
        }catch (Exception ignored){}
        System.out.println(amount +" amount");
    }
}

class CardHolder extends Thread{
    ATM atm;
    String name;
    double amount;

    public CardHolder(ATM ref,String name , double amount){
        atm=ref;
        this.name=name;
        this.amount=amount;
    }
    public void useATM(){
        atm.checkBalance(name);
        atm.Withdraw(name,amount);
    }
    public void run(){
        useATM();
    }
}
public class ATMChallenge {

    public static void main(String[] args) {

        ATM atm = new  ATM();

        CardHolder c1 = new CardHolder(atm,"ram",1500);
        CardHolder c2 = new CardHolder(atm,"Sham",200);
        CardHolder c3 = new CardHolder(atm,"Mohan",15850);

        c1.start();
        c2.start();
        c3.start();


    }

}
