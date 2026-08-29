import java.lang.Thread;

class MyThread extends Thread {
    String name;

    MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for(int i = 0; i < 5; i++) {
            System.out.println(name);

            try {
                Thread.sleep(100);
            } catch(Exception e) {
                e.printStackTrace();
            }
        }
    }
}



class thread {

    public static void main(String[] args) {
       MyThread t1 = new MyThread("neelamohan");
       MyThread t2 = new MyThread("logu");
       t1.start();
       t2.start();
      
    }
    
}