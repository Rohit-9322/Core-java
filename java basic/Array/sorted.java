// package Array;

public class sorted {
    public static void main(String[] args) {
        boolean issorted = true;
        int[] arr = {1,2,3,4,5};
        for(int i=0; i<arr.length-1; i++){
            if (arr[i] > arr[i+1]) {
                issorted = false;
                break;
            }
        }
        System.out.println(issorted? "sorted" : " NOt sorted");
    }
}
