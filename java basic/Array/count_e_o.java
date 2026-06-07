package Array;

public class count_e_o {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int even = 0;
        int odd = 0;
        for(int x : arr){
            if (x % 2 == 0) {
                even ++;
            }
            else{
                odd++;
            }
        }

        System.out.println("even count "+even);
        System.out.println("Odd count "+ odd);
    }
}
