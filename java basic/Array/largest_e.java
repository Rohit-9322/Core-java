package Array;

public class largest_e {
    public static void main(String[] args) {

        // FOR-EACH
        int[] arr = {10,20,30,40,40,50};
        int max = Integer.MIN_VALUE;
        for(int X : arr){
            if (X > max) {
                max = X;
            }
        }
        System.out.println(max);

        // FOR
        int max = arr[0];
        for(int i=0; i<arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
