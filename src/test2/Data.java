package test2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Data {
    private static List<People> peopleList= Arrays.asList( new People("Вася", 16, Sex.MAN),
            new People("Петя", 23, Sex.MAN),
            new People("Елена", 42, Sex.WOMEN),
            new People("Иван", 69, Sex.MAN));

   public static List<People>getPeopleList(){
       return peopleList;
   }
}
