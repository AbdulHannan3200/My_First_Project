import java.util.Scanner;

public class Array1D {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner uInput = new Scanner(System.in);

        // Ask user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = uInput.nextInt();

        // Create the array based on user input size
        int[] array = new int[size];

        // Ask user to input the array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = uInput.nextInt();
        }

        // Find and display the maximum and minimum values in the array
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);

        // Close the scanner
        uInput.close();
    }

    // Method to find the maximum value in the array
    public static int findMax(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Method to find the minimum value in the array
    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
}
