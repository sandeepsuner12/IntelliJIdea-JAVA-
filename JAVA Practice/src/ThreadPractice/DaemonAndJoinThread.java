package ThreadPractice;


class MyThread1 extends  Thread{

    public void run(){
        int i = 0;
        while (i<100){
            System.out.println(i+" My ..........");
            i++;
        }

    }
}
public class DaemonAndJoinThread
{

    public static void main(String[] args) {

        MyThread1 my = new MyThread1();

        //if daemon is true then program ends with execution of main method
        my.setDaemon(true);
        my.start();
        // to see thain we stopped main thread  for 10 ms
        /*try{Thread.sleep(10);}
        catch (Exception ignored){}*/

        //we can join thread to see daemon on action

        Thread mainThread = Thread.currentThread();
        try {
            mainThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
