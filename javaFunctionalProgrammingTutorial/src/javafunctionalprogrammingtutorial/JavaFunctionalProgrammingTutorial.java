package javafunctionalprogrammingtutorial;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author Ladzani_fabian
 */
public class JavaFunctionalProgrammingTutorial {
     public static void main(String[] args) {
         List<Person> people = List.of(
                 new Person("ladzi", Gender.MALE),
                 new Person("Maria", Gender.FEMALE),
                 new Person("John", Gender.MALE),
                 new Person("Aisha", Gender.FEMALE),
                 new Person("Alex", Gender.MALE),
                 new Person("Alice", Gender.FEMALE),
                 new Person("Julia", Gender.FEMALE),
                 new Person("Romeo", Gender.MALE)
         );
         
         people.stream()
                 .map(Person::getName)
                 .map(String::length)
                 .collect(Collectors.toList())
                 .forEach(System.out::println);
         
         boolean isEveryoneFemale = people.stream()
                 .allMatch(person -> Gender.FEMALE.equals(person.getGender()));
         System.out.println("the list of contains only females: "+ isEveryoneFemale);
         // allMatch is equivalent to the Universal quantifier/ AND operator...
         
         boolean containsFemale = people.stream()
                 .anyMatch(person -> Gender.FEMALE.equals(person.getGender()));
         System.out.println("the list has at least one female: "+ containsFemale);
         // anyMatch is equal to the existential quantifier/OR operator...
    }   
}

