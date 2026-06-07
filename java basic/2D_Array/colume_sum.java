//package 2D_Array;

public class colume_sum {
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
            for(int j=0; j<arr.length; j++)  {
                int sum =0;
              for(int i=0; i<arr.length; i++){
                
                sum += arr[i][j];
               
            }
            System.out.println();
             System.out.print(sum+" ");
        }
       
    }
}
