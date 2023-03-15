import java.util.ArrayList;
import java.util.List;

public class Data {
    private static List<Person> persons = new ArrayList<>();

    static{
        Person person1 = new Person("Ivan","Ivanov",19);
        Person person2 = new Person("Liliya","Nosach",32);
        Person person3 = new Person("Kate","Blank",54);
        Person person4 = new Person("Dmitriy","Moch",34);
        Person person5 = new Person("kirill","Petrov",26);
        Person person6 = new Person("Zlata","Kox",28);
        Person person7 = new Person("Misha","Smirnov",18);
        Person person8 = new Person("Ilya","Petrov",45);
        Person person9 = new Person("Artem","Bax",25);
        Person person10 = new Person("Sasha","Nos",33);

        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);
        persons.add(person9);
        persons.add(person10);

    }

    public static List<Person>getPersons(){
        return persons;
    }


}
