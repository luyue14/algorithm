package sort;

public class SortTest {
    public static void main(String[] args) {
        int[] array = { 1, 8, 4, 2, 4124, 23, 523, 64, 2346, 3234, 3, 23, 256234, 234, 42 };

        HeapSort.sort(array);
        printArray("heap sort", array);

        int[] array2 = { 1, 8, 4, 2, 4124, 23, 523, 64, 2346, 3234, 3, 23, 256234, 234, 42 };
        QuickSort.sort(array2);
        printArray("quick sort", array2);

    }

    public static void printArray(String sortName, int[] array) {
        System.out.print(sortName + " result: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println();
    }
}
