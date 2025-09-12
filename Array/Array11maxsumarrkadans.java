public class Array11maxsumarrkadans {
    public static void kadans(int numbers[]){
        int maxSum= Integer.MIN_VALUE; //-infinity
        int currSum=0;
        for(int i=0;i<numbers.length;i++){
            currSum+=numbers[i];
            if(currSum<=0){
                currSum=0;

            }else{
                maxSum=Math.max(currSum,maxSum);//this can say that which having the gretest value as the math function is max
            }
        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int numbers[]={1,2,5,-5,-7};
        kadans(numbers);
        
    }
}
    

