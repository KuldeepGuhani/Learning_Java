package Coding_Questions;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccuranceOfEachCharacter {

    public static void main(String[] ars) {
        //using map
        String name = "kuldeep";
        Map<Character, Integer> ofc = new LinkedHashMap<>();
        for (char ch : name.toCharArray()) {
            if (ofc.containsKey(ch)) {
                ofc.put(ch, ofc.getOrDefault(ch, 0) + 1);
            } else {
                ofc.put(ch, 1);
            }
        }

        System.out.println(ofc.toString());

        // using stream
        //Map<Character,Long> rsult=name.chars().mapToObj(c-> (char) c)
        //                              .collect(Collectors.groupingBy(ch->ch,Collectors.counting()));

        //insertion order maintain
        Map<Character,Long> rsult=name.chars().mapToObj(c-> (char) c)
                                      .collect(Collectors.groupingBy(Function.identity(),java.util.LinkedHashMap:: new,Collectors.counting()));
        System.out.println("Stream result :   "+rsult);
    }
}
