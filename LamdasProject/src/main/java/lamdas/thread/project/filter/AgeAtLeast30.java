package lamdas.thread.project.filter;

import lamdas.thread.project.model.Person;

public class AgeAtLeast30 implements Filter<Person> {
    @Override
    public boolean Test(Person person) {
        if (person.getAge() >= 30) {
            return true;
        } else {
            return false;
        }
    }
}
