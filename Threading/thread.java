public class thread{
    public static void main(String[] args) {
        // System.out.println("Current Thread is : " + Thread.currentThread().getName());
        // HelloThread t1 = new HelloThread();
        // t1.start(); // assignes task to different thread
        // t1.run(); //assignes task to the current running thread
        // HelloThread t2 = new HelloThread();
        // t2.start();

        // PrintNumber p1 = new PrintNumber();
        // p1.start();

        // PrintNumber p2 = new PrintNumber();
        // p2.start();
        Thread t1 = null;
        for(int i = 1; i < 100; i++){
            t1 = new PrintNum(i);
            t1.start();
        }

    }
}

class HelloThread extends Thread{
    @Override
    public void run(){
        System.out.println("Current Thead is : " + Thread.currentThread().getName());
    }
}

class PrintNum extends Thread{
    int num;
    @Override
    public void run(){
        System.out.println(num + " " + Thread.currentThread().getName());
    }
    PrintNum(int num){
        this.num = num;
    }

}

class PrintNumber extends Thread{
    @Override
    public void run(){
        for(int i = 1; i <= 10; i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}