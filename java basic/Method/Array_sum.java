package Method;

public class Array_sum {

    // using method 
    static int sum(int[] arr){
        int total = 0;
        for(int num : arr){
            total += num;
        }
        return total;
    }


    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
        System.out.println(sum(arr));
    }
}
