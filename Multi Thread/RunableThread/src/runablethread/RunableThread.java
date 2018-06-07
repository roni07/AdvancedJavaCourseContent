

//Thread creation by implementing the Runnable Interface


package runablethread;

public class RunableThread {

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++){
            Thread object = new Thread(new A());
            object.start();
        }
        
    }

}

class A implements Runnable {

    public void run() {
        try {
            System.out.println("Thread" + Thread.currentThread().getId() + "is ruuning");
        } catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
}
