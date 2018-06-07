package singletondemo;

public class SingleObject {
   
    //create an object of single object 
    private static SingleObject instance = new SingleObject();
   
    private static SingleObject newInstance = new SingleObject();
    
   //make the constructor private so that this class can not be 
    //instantiated
   private SingleObject(){}
   
   public static SingleObject getInstance(){
       return instance;
   }
   
   public static SingleObject getNewInstance(){
       return newInstance;
   }
   
   public void showMessage(){
       System.out.println("hello there");
   }
   
   public void hozoborolo(){
       System.out.println("kiccu buhinai ami");
   }
   
}
