public class string {
    public static void main(String[] args) {
        // Array of strings
        String[] arr = {"Banana", "Apple", "Mango", "Orange", "Pineapple"};

        // Bubble Sort to sort the array
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // Compare adjacent elements
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Swap if they are in the wrong order
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
