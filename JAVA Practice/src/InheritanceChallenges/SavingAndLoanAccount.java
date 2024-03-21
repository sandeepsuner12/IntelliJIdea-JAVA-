package InheritanceChallenges;


class Account{
    private String accountNo,name,address,phoneNo,dateOfBirth;
    protected double balance;

    public Account(String accountNo, String name, String dateOfBirth) {
        this.accountNo = accountNo;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        balance=0;
    }

    public Account(String accountNo, String name, String address, String phoneNo, String dateOfBirth) {
        this.accountNo = accountNo;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.dateOfBirth = dateOfBirth;
        balance=0;
    }
    public double getBalance() {
        return balance;
    }
    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

class  SavingAccount extends Account{

    public SavingAccount(String accountNo, String name, String dateOfBirth) {
        super(accountNo, name, dateOfBirth);
    }

    public SavingAccount(String accountNo, String name, String address, String phoneNo, String dateOfBirth) {
        super(accountNo, name, address, phoneNo, dateOfBirth);
    }

    void deposit(double amount){
            balance+=amount;
    }
    void withdraw(double amount){
        balance-=amount;
    }

}
class  LoanAccount extends Account{

    public LoanAccount(String accountNo, String name, String dateOfBirth) {
        super(accountNo, name, dateOfBirth);
    }

    public LoanAccount(String accountNo, String name, String address, String phoneNo, String dateOfBirth) {
        super(accountNo, name, address, phoneNo, dateOfBirth);
    }

    void deposit(double amount){
        balance+=amount;
    }
    void withdraw(double amount){
        balance-=amount;
    }

    public class SavingAndLoanAccount {

        public static void main(String[] args) {

        }
    }
}
