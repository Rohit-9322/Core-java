package 2D_Array;

public class large {
     public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        // Largest NUmber in arr 

        //int max = arr[0][0];
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }


            }
        }
        System.out.println(max);

    }
}
