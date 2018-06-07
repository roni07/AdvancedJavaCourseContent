package designpatternone;

public class Dog extends Animal{
    
    public void digHole(){
        System.out.println("Dug a hole");
    }
    
    public Dog(){
        super();
        setSound("Bark");
    }
    
    public void changeRandom(int random){
        random = 10;
        System.out.println("Random in method: " + random);
    }
   
    
}
