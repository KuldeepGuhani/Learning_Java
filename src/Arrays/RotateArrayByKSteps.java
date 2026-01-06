package Arrays;

public class RotateArrayByKSteps {
    //left and right steps.
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=2;
//
//        // left rotate by k steps. // tc- 0(n*k) and sc -0(1)
//        for(int i=0;i<k;i++){
//            int first=arr[0];
//            System.out.println(first);
//
//            for(int j=0;j<arr.length-1;j++){
//                arr[j]=arr[j+1];
//
//            }
//            arr[arr.length-1]=first;
//        }
//
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//        System.out.println();
//        System.out.println("right shift");

//        // right rotate by k steps.
//        for(int i=0;i<k;i++){
//            int first=arr[arr.length-1];
//            System.out.println(first);
//
//            for(int j=arr.length-1;j>0;j--){
//                arr[j]=arr[j-1];
//
//            }
//            arr[0]=first;
//        }
//
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
//

        int n=arr.length;

        //left traverse
//        reverse(arr,0,k-1);
//        reverse(arr,k,n-1);
//        reverse(arr,0,n-1);


        //right traverse
        reverse(arr,0,n-1);
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);

for(int num:arr){
    System.out.print(num+" ");
}
    }

    public static void reverse(int[] arr,int left,int right){
        while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
        }
    }
}
