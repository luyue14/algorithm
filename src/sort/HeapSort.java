package sort;

public class HeapSort {
    public static void sort(int[] array) {
        int temp;

        buildMaxHeap(array);
        for (int i = array.length - 1; i >= 0; i--) {
            temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            maxHeap(array, 0, i);
        }
    }

    public static void buildMaxHeap(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = array.length / 2; i >= 0; i--) {
            maxHeap(array, i, array.length);
        }
    }

    public static void maxHeap(int[] array, int index, int length) {
        int leftChild = index * 2 + 1;
        int rightChild = index * 2 + 2;
        int largest = index;

        if (leftChild < length && array[leftChild] > array[index]) {
            largest = leftChild;
        }

        if (rightChild < length && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        if (largest != index) {
            int temp = array[index];
            array[index] = array[largest];
            array[largest] = temp;
            maxHeap(array, largest, length);
        }

    }
}
