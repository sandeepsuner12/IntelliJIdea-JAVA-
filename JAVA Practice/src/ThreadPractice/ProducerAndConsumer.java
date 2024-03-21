package ThreadPractice;

/**
 * @version 0.1
 */
class Resource{
    int data;
    boolean flag=true;

    synchronized public void setData(int data) {
        while (flag==false){
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        this.data = data;
        flag=false;
        notify();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    synchronized public int getData() {
        while (flag==true){
            try {
                wait();
            } catch (InterruptedException ignored) {}
        }
        flag=true;
        notify();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return data;
    }


}

class Producer extends Thread{
    Resource ref;

    public Producer(Resource ref) {
        this.ref = ref;
    }

    public void run(){
        int counter = 0;
        while (counter<100){
            ref.setData(counter);
            counter++;
            System.out.println("Producer " + counter);
        }
    }
}
class Consumer extends Thread{
    Resource ref;

    public Consumer(Resource ref) {
        this.ref = ref;
    }

    public void run(){
        int counter = 0;
        while (counter<100){
            System.out.println("Consumer " + ref.getData());
            counter++;
        }
    }
}

public class ProducerAndConsumer {

    public static void main(String[] args) {
        Resource re = new Resource();
         Producer p = new Producer(re);
         Consumer c = new Consumer(re);
         p.start();
         c.start();
    }
}
