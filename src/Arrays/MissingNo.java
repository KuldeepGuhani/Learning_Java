package Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,1};
        for(int i=1;i<=arr.length;i++){
            int count=0;
            for(int num:arr){
                if(num==i) count++;
            }
            if(count==0) {
                System.out.println("Missing : " + i);
            }
            if(count==2) {
                System.out.println("Repeated   : " + i);
            }

        }
    }
}
