public class Array2Dsum {
    public static int sumofarray(int matrix[][]){
         int sum=0;
         for(int j=0;j<matrix.length;j++){
            sum=sum+matrix[1][j];
            
         }
         return sum;
       
         

    }




    public static void main(String args[]){
        int matrix[][]={
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        int sum;
        System.out.println("The sum of the 2nd row is");
       System.out.println(sumofarray(matrix));
    

    }
    
}
