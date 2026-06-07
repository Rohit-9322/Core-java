//package Array;

public class smalest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,40,50};
        int min = Integer.MAX_VALUE;
        for(int X : arr){
            if (X < min) {
                min = X;
            }
        }
        System.out.println(min);
    }
}

