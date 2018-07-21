package lamdas.thread.project.model;

public class Person {
    private String name;
    private Sex sex;
    private int age;

    public Person(String name, Sex sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Sex getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return
                "name='" + name +
                ", sex=" + sex +
                ", age=" + age
                ;
    }
}
