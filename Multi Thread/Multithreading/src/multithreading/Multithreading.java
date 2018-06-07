
//Thread creation by extending the Thread class

package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Multithreading {

    public static void main(String[] args) {

        A ob1 = new A();
        ob1.start();

        B ob2 = new B();
        ob2.start();

    }

}

class A extends Thread {

    public void show() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");

            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(A.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void run() {
        show();
    }

}

class B extends Thread {

    public void show() {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(5);
            } catch (InterruptedException ex) {
                Logger.getLogger(B.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void start() {
        show();
    }

}
