package ThreadPractice;

public class ThreadUsingInterface implements Runnable{

    @Override
    public void run() {
        int i =0;
        while (i<100){
            System.out.println(i+"Heloooooo");
            i++;
        }
    }

    public static void main(String[] args) {

        ThreadUsingInterface tin = new ThreadUsingInterface();
        Thread th = new Thread(tin);
        th.start();
        int i =0;
        while (i<100){
            System.out.println(i+"worlddddd");
            i++;
        }
    }
}
