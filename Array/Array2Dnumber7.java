public class Array2Dnumber7 {
    public static void main(String[] args) { 

        int[][] matrix ={
            {4,7,8},
            {8,8,7},
        };
        int count=0;
        int row = matrix.length;
        int col= matrix[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(matrix[i][j]==7){
                    count++;
                }
            }

        }
       
        System.out.println(count);

    
}
}
