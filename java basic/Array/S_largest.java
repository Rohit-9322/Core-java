// package Array;

public class S_largest {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,80,60,97};
        int Max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int x : arr){
            if (x > Max) {
                smax = Max;
                Max = x;
            }
            else if (x > smax && x != Max) {
                  smax = x;
            }

        }
        System.out.println(Max);
        System.out.println(smax);
        
    }
}
