// package Array;

public class find_n {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int key = 30;
        boolean isfoound = false;
        for(int i=0; i<arr.length; i++){
            if (arr[i] == key) {
                isfoound = true;
                break;
            }
        } 
        if (isfoound) {
            System.out.println(" Found ");
        }
        else{
            System.out.println("Not Found");
        }
    }
}
