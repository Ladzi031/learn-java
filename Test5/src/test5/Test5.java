package test5;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;

public class Test5 {
    //practice the java.util.function.Function interface ...
    public static void main(String[] args) {
        String[] numbers = {"1", "2", "3"};
       List<Integer> result = testMe(numbers);
    }
    public static List<Integer> testMe(String[] stringNumbers){
         List<Integer> numbersList = new ArrayList<>();
                    Stream.of(stringNumbers)
                    .mapToInt(Integer::parseInt)
                    .forEach(numbersList::add);
           return numbersList;
    }     
}