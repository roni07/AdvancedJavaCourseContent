package singletondemo;

public class SingletonDemo {

    public static void main(String[] args) {

     SingleObject object = SingleObject.getNewInstance();
     
    // SingleObject object2 = SingleObject.getInstance();
     
     object.showMessage();
     //object2.hozoborolo();
        
    }
    
}
