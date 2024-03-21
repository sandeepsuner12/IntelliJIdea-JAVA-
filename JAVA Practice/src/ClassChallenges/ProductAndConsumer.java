package ClassChallenges;

class Product {

    private int price, quantity;
    private String name,itemNo;

    public Product(String name, String itemNo , int price , int quantity)
    {
        this.name=name;
        this.itemNo=itemNo;
        this.price=price;
        this.quantity=quantity;
    }



    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Consumer{
    private int customerID;
    private String name,address,phoneNo;

    public int getCustomerID() {
        return customerID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}

public class ProductAndConsumer {
}
