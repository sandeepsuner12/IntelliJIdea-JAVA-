package ThreadPractice;

class MyData{
    //1)  Using Synchronization
    //synchronized void display(String str){

    //2) Without Synchronization
    void display(String str){
        //3) Using Block
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
            }
            System.out.println();
        }
    }
}

class Thread1 extends Thread{
    MyData d;
    Thread1(MyData ref){
        d=ref;
    }

    public void run(){
        d.display("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
    }
}

class Thread2 extends Thread{
    MyData d;
    Thread2(MyData ref){
        d=ref;
    }

    public void run(){
        d.display("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
    }

}


public class Synchronization {

    public static void main(String[] args) {
        MyData d = new MyData();
        Thread1 th1 = new Thread1(d);
        Thread2 th2 = new Thread2(d);
        th1.start();
        th2.start();
    }


}
