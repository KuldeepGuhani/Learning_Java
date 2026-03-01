package Coding_Questions.Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class findDuplicateNo {
    public static void main(String[] args){
    int arr[]={1,2,3,3,4,5};
        //System.out.println(duplicateNo(arr));
        //removeDuplicates(arr);
        System.out.println(duplicateNoSiingle(arr));
    }

    private static int duplicateNo(int[] arr) {
      for(int i=0;i<arr.length;i++){
          for(int j=i+1;j<arr.length;j++){
              if(arr[i]==arr[j]){
                  return arr[i];
              }

          }
      }
      return -1;
    }

    private static int duplicateNoSiingle(int[] arr) {
        for(int i=1;i<arr.length;i++){
                if(arr[i]==arr[i-1]){
                    return arr[i];
                }
        }
        return -1;
    }


    private static void removeDuplicates(int arr[]){
        Set<Integer> hash=new HashSet<>();

        for(int num:arr){
            if(!hash.add(num)){

            System.out.println(num);
            }
        }
    }
}
