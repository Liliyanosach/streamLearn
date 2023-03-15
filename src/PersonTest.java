import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PersonTest {
    public static void main(String[] args) {
        List<Person> persons = Data.getPersons();

        List<Person> persons2 = persons.stream()
                .filter(person->person.getAge()>40)
                .sorted()
                .collect(Collectors.toList());

        persons2.forEach(System.out::println);

        Optional<Person> persons3 = persons.stream()
                .filter(p -> p.getAge()>30)
                .findFirst();
        System.out.println(persons3.get());

    }
}
