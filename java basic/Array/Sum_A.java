 package Array;

public class Sum_A {
    public static void main(String[] args) {

       //  Using for-each loop 
        int[]  arr = {1,2,3,4,5};
        int sum = 0;
        for(int x : arr){
            sum +=x;
        }
        System.out.println(sum);

        // Using For loop
        int[] arr1 = {10,20,30,40,50};
        int sum1 = 0;
        for(int i=0; i<arr1.length; i++){
            sum1 = sum1 + arr1[i];
        }
        System.out.println(sum1);
    }
}
