import java.util.Random;

public class SufferdArray {

    // Method to shuffle the array
    public static void shuffle(int[] array) {
        Random random = new Random();
        int n = array.length;

        // Iterate from the last element to the second element
        for (int i = n - 1; i > 0; i--) {
            // Generate a random index from 0 to i
            int j = random.nextInt(i + 1);
            
            // Swap array[i] with array[j]
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        System.out.print("Shuffled Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        // Example array
        int[] nums = { 1, 2, 3, 4, 5, 6 };

        // Print original array
        System.out.print("Original Array: [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Shuffle the array
        shuffle(nums);

        // Print the shuffled array
        printArray(nums);
    }
}
