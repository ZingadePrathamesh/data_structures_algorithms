import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStream {
    public static void main(String[] args) {
        List<String> names = List.of("rahul", "mohan", "pyarelal", "janki", "radha", "balram");
        String uniqueCharacters = names
                .stream()
                .map(s->s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.joining());
        //we just extracted all the unique characters from the list using stream and the
        //terminal function and intermediate operations
        System.out.println(uniqueCharacters);
    }


}
