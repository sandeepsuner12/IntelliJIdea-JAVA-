public class Human extends Animal{

    @Override
    public String getFamily() {
        return "Homosapien";
    }
}

 class Sandeep extends Human{

     public static void main(String[] args) {
         Human Sand = new Human();
         Sand.setAge(24);
         System.out.println("Faimily : " + Sand.getFamily());
         System.out.println("Age : " + Sand.getAge());
     }

}
