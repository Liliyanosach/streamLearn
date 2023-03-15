package test1;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> elements = new ArrayList<>();

        elements.add("B");
        elements.add("D");
        elements.add("C");
        elements.add("A");
        elements.add("E");

        ArrayList<String> sortedElements = elements.stream()
                .sorted()
                // Создаем коллектор, чтобы вывести данные в новый ArrayList.
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println("Мы отсортировали это специально для тебя: " + sortedElements);
    }
}

