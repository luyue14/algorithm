package sort;

public class QuickSort {
    public static void sort(int[] array) {
        helper(array, 0, array.length - 1);
    }

    public static void helper(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }

        int low = start;
        int high = end;
        int key = array[start];
        while (low < high) {

            while (array[high] > key && low < high) {
                high--;
            }
                array[low] = array[high];
            while (array[low] <= key && low < high) {
                low++;
            }
                array[high] = array[low];
        }
        array[low] = key;
        helper(array, start, low - 1);
        helper(array, low + 1, end);
    }
}
