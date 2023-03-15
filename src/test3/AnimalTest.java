package test3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

        List<Animal> predator = animals.stream()
        // Filter
                .filter(a -> a.getClassification().equals(Classification.PREDATOR))
                .collect(Collectors.toList());
        predator.forEach(System.out::println);
        System.out.println("");

        //Sorted
        List<Animal> test = animals.stream()
                .sorted(Comparator.comparing(Animal::getAge))
                .collect(Collectors.toList());
        test.forEach(System.out::println);

    }
    private static List<Animal> getAnimals(){
        return List.of(
                new Animal("Слон", 20, Classification.HERBIVORE),
                new Animal("Лев", 10, Classification.PREDATOR),
                new Animal("Гиена", 11, Classification.PREDATOR),
                new Animal("Жираф", 7, Classification.HERBIVORE),
                new Animal("Гибон", 35, Classification.OMNIVOROUS),
                new Animal("Лошадь", 36, Classification.HERBIVORE),
                new Animal("Рысь", 2, Classification.PREDATOR),
                new Animal("Динозавр", 200, Classification.PREDATOR));
    }
}
