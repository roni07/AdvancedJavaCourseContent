
package designpatternone;

public class DesignPatternOne {

    
    public static void main(String[] args) {
       Dog grover = new Dog();
       
       grover.setName("Groover");
        System.out.println(grover.getName());
       
       grover.setWeight(-1);
       
        System.out.println(grover.getSound());
        
        int random = 12;
        
        grover.changeRandom(random);
        
        System.out.println("After call random "+ random);
        
        changeObjectName(grover);
        System.out.println("After call the method object name : "+ grover.getName());
    }
    
    public static void changeObjectName(Dog grover){
        grover.setName("Fido");
    }
    
}
