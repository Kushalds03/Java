public class Arrays8subarr {
    public static void printSubarraysWithSums(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) { // starting index
            for (int j = i; j < numbers.length; j++) { // ending index
                int sum = 0; // Initialize sum for this subarray
                System.out.print("Subarray: ");
                
                for (int k = i; k <= j; k++) { // printing elements from start to end
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; // Calculate the sum of the current subarray
                }
                
                System.out.println(" | Sum: " + sum); // Print the sum of the subarray
            }
        }
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10};
        printSubarraysWithSums(numbers);
    }
}
