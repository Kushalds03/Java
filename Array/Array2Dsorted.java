public class Array2Dsorted {
    public static boolean  sortedarray(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;
        int row=0;
        int col=cols-1;
         target =5;
        while(row<rows && col<cols){
            if(matrix[row][col]== target){
                return true;
            }else if (matrix[row][col]>target) {
                col--;
                
            }else{
                row++;
            }
        }
        return false;

    }




    public static void main(String[] args) {
        int[][] matrix={
            {1,4,7,11},
            {2,5,8,12},
            {3,6,9,16},
            {10,13,14,17}
        };
        int target =5;
                
        if(sortedarray(matrix, target)){
            System.out.println("The target element is  found");
        }else{
            System.out.println("The target elemnt is not found ");

        }

            
        }
        
    }
    

