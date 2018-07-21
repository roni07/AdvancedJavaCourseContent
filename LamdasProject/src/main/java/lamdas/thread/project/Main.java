package lamdas.thread.project;


import lamdas.thread.project.filter.AgeAtLeast30;
import lamdas.thread.project.filter.Filter;
import lamdas.thread.project.filter.FilterSmallString;
import lamdas.thread.project.filter.FilterString;
import lamdas.thread.project.io.Reader;
import lamdas.thread.project.model.Person;
import lamdas.thread.project.model.Sex;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    class ageAtLeast30 implements Filter<Person> {
        //inner class
        @Override
        public boolean Test(Person person) {
            if (person.getAge() >= 30) {
                return true;
            } else {
                return false;
            }
        }
    }


    public Main() {

        Reader reader = new Reader();
        List<Person> personList = reader.readPersonsFromCsv("persons.csv");

        //  Filter<Person> filter = new AgeAtLeast30();

        //  Filter<String> stringFilter = new FilterString();

        Filter<Person> filterAge = new AgeAtLeast30();  // calling inner class

       /* Filter<Person> female = new Filter<Person>() {
            //anonymous inner class
            @Override
            public boolean Test(Person person) {
                if (person.getSex() == Sex.FEMALE) {
                    return true;
                } else {
                    return false;
                }
            }
        }; */

        Filter<Person> filter = person -> person.getSex() == Sex.FEMALE;

        Filter<String> filterString = new FilterSmallString();

        long countOfYoungFemale = personList
                .stream()
                .parallel()
                .filter(person -> person.getSex() == Sex.FEMALE)
                .filter(person -> person.getAge() < 30)
                .count();
        System.out.println(countOfYoungFemale);

        String youngFemaleNames = personList
                .stream()
                .parallel()
                .filter(person -> person.getSex() == Sex.FEMALE)
                .filter(person -> person.getAge() < 30)
                .findAny()  //find first()
                .orElse(new Person("nobody", Sex.FEMALE, 20))
                .getName();
        System.out.println(youngFemaleNames);

        List<Integer> ageList = personList
                .stream()
                .filter(person -> person.getAge() < 30)
                .map(person -> person.getAge())
                .sorted()
                .collect(Collectors.toList());
        System.out.println(ageList);


        List<Integer> differentAgeList = personList
                .stream()
                .map(person -> person.getAge())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(differentAgeList);

        for (Integer age : differentAgeList){
            long count = personList
                    .stream()
                    .filter(person -> person.getAge() == age)
                    .count();
            System.out.println("Age: " + age + " Count: " + count);
        }

      /*  for (Person person : personList) {
            if (filterAge.Test(person) && female.Test(person)) {
                System.out.println(person);
            }
        }*/

    }

    public static void main(String args[]) {
        new Main();
    }
}
