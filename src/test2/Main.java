package test2;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<People> pl = Data.getPeopleList();

        pl.forEach(System.out::println);

        /*
         * Выбрать мужчин-военнообязанных (от 18 до 27 лет)
         */
        List<People> people2 = pl.stream()
                .filter(p -> p.getAge() > 18 && p.getAge() < 27 && p.getSex() == Sex.MAN)
                .collect(Collectors.toList());
        people2.forEach(System.out::println);

        /*
         * Найти средний возраст среди мужчин
         */
        double people3 = pl.stream()
                .filter(people -> people.getSex() == Sex.MAN)
                .mapToInt(People::getAge)
                .average()
                .getAsDouble();

        System.out.println(people3);


    }
}
