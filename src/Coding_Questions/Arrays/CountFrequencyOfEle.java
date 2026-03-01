package Coding_Questions.Arrays;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CountFrequencyOfEle {

    public static void main(String[] args){
    int[] arr={1,2,1,2,5,4,1};
    Map<Integer,Long> res= Arrays.stream(arr).boxed().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(res);
    }
}
