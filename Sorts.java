import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

/**
 * Класс Sort, в котором написаны 7 видов сортировки:
 * 1. Пузырьковая;
 * 2. Шейкерная;
 * 3. Вставками;
 * 4. Слиянием;
 * 5. Расческой;
 * 6. Шелла;
 * 7. Хоара.
 */

class Sorts {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * 2001) - 1000);
        }

        System.out.print(Arrays.toString(arr));
        System.out.print(" || ");
        quickSort(arr);
        System.out.println(Arrays.toString(arr));

        cin.close();
    }

    public static void printMassiv(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }

    public static void bubble(int[] array) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isSorted = false;
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                }
            }
        }

    }

    public static void shake(int[] array) {
        int leftSide = 0, rightSide = array.length - 1, buf = 0;

        while (leftSide < rightSide) {

            // Max element searching
            for (int i = leftSide; i < rightSide; i++) {
                if (array[i] > array[i + 1]) {
                    buf = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = buf;
                }
            }
            rightSide--;

            // Min element searching
            for (int i = rightSide; i > leftSide; i--) {
                if (array[i] < array[i - 1]) {
                    buf = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = buf;
                }
            }
            leftSide++;

        }

    }

    public static void insertion(int[] array) {
        int key = 0;

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            key = array[i];

            while (j >= 0 && array[j] > key) {

                array[j + 1] = array[j];
                j--;
            }

            // we did j + 1 to avoid crossing boundaries of array
            array[j + 1] = key;
        }

    }

    public static void mergeSort(int[] array, int len) {
        if (len < 2) {
            return;
        }

        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }

        for (int i = mid; i < len; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left, mid);
        mergeSort(right, len - mid);
        merge(array, left, mid, right, len - mid);

    }

    public static void merge(int[] array, int[] left, int mid, int[] right, int lenmid) {
        int i = 0, j = 0, k = 0;

        while (i < mid && j < lenmid) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        while (i < mid) {
            array[k++] = left[i++];
        }

        while (j < lenmid) {
            array[k++] = right[j++];
        }
    }

    public static void comb(int[] array) {
        int step = array.length;
        boolean isSorted = false;

        while (step > 1 || !isSorted) {
            step = (int) (step / 1.247);
            isSorted = true;

            for (int i = 0; i + step < array.length; i++) {

                if (array[i] > array[i + step]) {
                    swap(array, i, i + step);
                    isSorted = false;
                }
            }
        }
    }

    public static void swap(int[] array, int idx1, int idx2) {
        int buf = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = buf;
    }

    public static void shell(int[] array) {
        int key = 0;

        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                key = array[i];
                int j = i;
                while (j >= step && array[j - step] > key) {
                    array[j] = array[j - step];
                    j -= step;
                }
                array[j] = key;
            }
        }
    }

    public static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private static void quickSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }

        int pivot = array[end];

        int leftIndex = partition(array, begin, end, pivot);

        quickSort(array, begin, leftIndex - 1);
        quickSort(array, leftIndex + 1, end);

    }

    private static int partition(int[] array, int begin, int end, int pivot) {
        int leftIndex = begin, rightIndex = end;

        while (leftIndex < rightIndex) {

            while (array[leftIndex] <= pivot && leftIndex < rightIndex) {
                leftIndex++;
            }

            while (array[rightIndex] >= pivot && leftIndex < rightIndex) {
                rightIndex--;
            }

            swap(array, leftIndex, rightIndex);
        }

        swap(array, leftIndex, end);
        return leftIndex;
    }

}
