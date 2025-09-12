public class Arrays7pairs {
    public static void printpairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];//2,4,6,8,10
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" +current + "," +numbers[j] + ")");
                tp++;
            
            }
            System.out.println();


        }
        System.out.println(tp);//another way isn (n*(n-1)/2)
    }






    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        printpairs(numbers);
        
    }
    
}
