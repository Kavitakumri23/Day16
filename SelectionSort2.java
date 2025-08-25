 import java.util.Arrays;

public class SelectionSort2 {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        int n = arr.length;

        // Traverse through all elements
        for (int i = 0; i < n - 1; i++) {
            // Assume current index has minimum element
            int minIndex = i;

            // Find the actual minimum element in unsorted part
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // update minIndex
                }
            }

            // Swap the found minimum with first element of unsorted part
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}

