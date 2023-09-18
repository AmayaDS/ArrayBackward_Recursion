/*public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr);

        System.out.println("\nArray Printed Backward:");
        printArrayBackward(arr);
    }

    // Method to print the array forward
    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to print the array backward
    static void printArrayBackward(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}*/

//using recursion
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println("Original Array:");
        printArray(arr, 0);  // Start from the first element

        System.out.println("\nArray Printed Backward:");
        printArrayBackward(arr, arr.length - 1);  // Start from the last element
    }

    // Method to print the array forward using recursion
    static void printArray(int[] arr, int index) {
        if (index < arr.length) {
            System.out.print(arr[index] + " ");
            printArray(arr, index + 1);
        }
    }

    // Method to print the array backward using recursion
    static void printArrayBackward(int[] arr, int index) {
        if (index >= 0) {
            System.out.print(arr[index] + " ");
            printArrayBackward(arr, index - 1);
        }
    }
}
