package Functional_Interface;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//functional interface
@FunctionalInterface
interface functionalInterface {
    void greet(String message);

}

public class FI_Streams {
    public static void main(String[] args) {

        functionalInterface fi = (message) -> {
            System.out.println(message + " How are u ..");
        };
        fi.greet("Hello KD !");

        //functional interface types learning //takes input ,return output.
        Function<Integer, String> fun = n -> "Number : " + n;
        System.out.println(fun.apply(5));

        //Predicate takes input , return boolean
        Predicate<Integer> pred = n -> n % 2 == 0;
        System.out.println(pred.test(5));//checking no is even or not returning true or false

        //consumer takes input ,return nothing
        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello kd consumer");

        //supplier takes nothing ,return something
        Supplier<Double> sup=()->Math.random();
        System.out.println(sup.get());

       //print even no
        List<Integer> result=List.of(1,2,3,4,5,6).stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(result);
        //print odd no
        List<Integer> resulto=List.of(1,2,3,4,5,6).stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(resulto);

        //print square all no
        List<Integer> resultsquare=List.of(1,2,3,4,5,6).stream().map(n->n*n).collect(Collectors.toList());
        System.out.println(resultsquare);

        //print multiply all no with 10
        List<Integer> mul=List.of(1,2,3,4,5,6).stream().map(n->n*10).collect(Collectors.toList());
        System.out.println(mul);

        //print no greater than 5
        List<Integer> greater5=List.of(1,2,3,4,5,6).stream().filter(n->n>5).collect(Collectors.toList());
        System.out.println(greater5);

        //print all string to uppercase no
        List<String> uper=List.of("java","kd").stream().map(s-> s.toUpperCase()).toList();
        System.out.println(uper);

        //print all string with a
        List<String> startA=List.of("apple","java","kd").stream().filter(n-> n.startsWith("a")).toList();
        System.out.println(startA);

        //print all string length 4
        List<String> lengthgreater4=List.of("java","kd","apple").stream().filter(s-> s.length()>2).collect(Collectors.toList()) ;
        System.out.println("lenght "+lengthgreater4);


        //print all string sort alphabetically
        List<String> alp=List.of("java","kd","apple").stream().distinct().sorted().toList();
        System.out.println(alp);

        //print all string join with comma
        String stringwithcomma=List.of("java","kd","apple").stream().collect(Collectors.joining(", "));
        System.out.println(stringwithcomma);

        //print remove duplicate list
        List<Integer> removedup=List.of(1,2,2,3,3,4).stream().distinct().toList();
        System.out.println(removedup);

        //print find duplicate list
        Set<Integer> hash=new HashSet<>();
        List<Integer> finddup=List.of(1,2,2,3,3,4).stream().filter(n-> !hash.add(n)).toList();
        System.out.println(finddup);


        //print find frequency of each element
        Map<Integer,Long> freq=List.of(1,2,2,3,3,4).stream().collect(Collectors.groupingBy(n->n,Collectors.counting()));
        System.out.println(freq);

        //print find non repeating character
        String str="aabbcde";
        Character norepeat=str.chars().mapToObj(c-> (char) c).filter(c-> str.indexOf(c) ==str.lastIndexOf(c)).findFirst().orElse(null);
        System.out.println(norepeat);

        //print find string by length
        List<String> lengthlist=List.of("java","kd","google").stream().sorted(Comparator.comparingInt(String::length)).toList();
        System.out.println(lengthlist);

//check if none match condtion (>100)
        boolean none = List.of(1, 2, 2, 3, 3, 4).stream().noneMatch(n -> n > 100);
        System.out.println(none);

        //get max
        int max = List.of(1, 2, 2, 3, 3, 4).stream().mapToInt(Integer::intValue).max().orElseThrow();
        System.out.println(max);

        //get min
        Long count = List.of(1, 2, 2, 3, 3, 4).stream().count();
        System.out.println(count);

        //reduce sum of all no
        int reduce = List.of(1, 2, 2, 3, 3, 4).stream().reduce(0,Integer::sum);
        System.out.println(reduce);













    }


}
