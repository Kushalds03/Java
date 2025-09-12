import java.util.*;
public class Array2d2 {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("The rows are:");
        int row= sc.nextInt();
        System.out.println("The col are");
        int col =sc.nextInt();
        int num[][]=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
            
                num[i][j] = sc.nextInt();
               
            }
           
        }
        

                int x = sc.nextInt();
                for(int i=0;i<row;i++){
                    for(int j=0;j<col;j++){
                        if(num[i][j]==x){
                            System.out.println("THe number is found  at " + i +"," + j );
                        }
                    }

                }
         
            }
        }
        
        
    
