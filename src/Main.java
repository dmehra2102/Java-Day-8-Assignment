import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        //  Converting all Strings in UPPERCASE format
        Stream<String> names = Stream.of("abc","d","ef");
        names.map(name -> name.toUpperCase()).forEach(name-> System.out.println(name));

        //  Printing all those strings who are not empty
        List<String> randomStrings = Arrays.asList("abc","","bc","efg","abcd","","jkl");
        randomStrings.stream().filter(n -> n!="").forEach(n ->  System.out.println(n));

        //  Filtering those students whose name start with letter A
        List<String> studentNames = Arrays.asList("Ayush","Deepanshu","Aashish","Arun","Vishal","Adarsh","Akhil","Kapil");
        studentNames.stream().filter(name -> name.startsWith("A")).forEach(name -> System.out.println(name));

        //  Check your age by passing your age in a given example format
        AgeCalculator findAge = new AgeCalculator("2003-09-21");
    }
}