package streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person{
    private String name;
    private  int age;


    //Contructor
    public Person(String name, int age) {
        this.name = name;
        this.age= age;
    }
    //Getter n Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Getter n Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Stream {

    public static void main(String[] args){
        // Using streams to filter a list
        List<String> names = Arrays.asList("John", "Jane", "Bob", "Michael");
        List<String> filteredNames = names.stream().filter(name -> name.startsWith("J")).toList();
        System.out.println(filteredNames);

        // using stream to get maximum number of elements
        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 5, 7);
        int max = numbers.stream().max(Comparator.naturalOrder()).orElseThrow();
        System.out.println("Maximum number is: " + max);

        List<Integer> evenNumbers = numbers.stream().filter(number -> number % 2 == 0).toList();
        System.out.println("Even numbers: " + evenNumbers);

        List<Person> persons = new ArrayList<>();
        Person yusuf = new Person("Yusuf Babatunde", 20);
        Person abdAzeez = new Person("Abdul Azeez", 19);
        persons.add(yusuf);
        persons.add(abdAzeez);

        List<String> guys = persons.stream().map(person -> person.getName()).toList();
        List<Integer> ages = persons.stream().map(person -> person.getAge()).toList();
        System.out.println("The names of persons are: " + guys);
        System.out.println("The ages of persons are: " + ages);

//    Person ageIsTwenty = persons.stream().filter()
    }
}


