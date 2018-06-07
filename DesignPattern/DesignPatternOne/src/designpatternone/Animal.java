package designpatternone;

public class Animal {

    private String name;
    private int weight;
    private String sound;

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {

        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight is never less than 0");
        }
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getSound() {
        return sound;
    }

}
