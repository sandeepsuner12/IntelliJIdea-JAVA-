package ThreadPractice;

class Mythread extends Thread{



    @Override
    public void run() {
        int i=0;
        while (i<100){
            System.out.println(i+"Hello thread class");
            i++;

        }
    }
}
public class ThreadUsingClass {

    public static void main(String[] args) {
        int i=0;

        Mythread th = new Mythread();
        th.start();
        while (i<100){
            System.out.println(i+"world  main");
            Thread.yield();
            i++;

        }
    }
}
