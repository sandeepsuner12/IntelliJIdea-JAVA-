package ThreadPractice;

public class ThreadUsingSingleClass extends Thread{
    public ThreadUsingSingleClass(String name) {
        super(name);
        setPriority(Thread.MIN_PRIORITY);
    }

    public void run() {
        int i=0;
        while (i<10){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i+"Hellowwwwww");
            i++;
        }
    }

    public static void main(String[] args) {
        int i=0;

        ThreadUsingSingleClass th = new ThreadUsingSingleClass("My thread 1");
        System.out.println(th.getName());
        System.out.println(th.getId());
        System.out.println(th.getState());
        System.out.println(th.getPriority());
        th.start();
        th.interrupt();
        while (i<10){
            System.out.println(i+"worlddddddddddddd");
            i++;
        }
    }
}
