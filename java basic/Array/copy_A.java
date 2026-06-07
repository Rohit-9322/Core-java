//package Array;

public class copy_A {
    public static void main(String[] args) {
         int [] arr = {10,20,30,40,50};

         int [] copy = new int[arr.length];

         for(int i=0; i<arr.length; i++){
            copy[i] = arr[i];
         }

         for(int num : copy){
            System.out.print(num +" ");
        }
    }
}
