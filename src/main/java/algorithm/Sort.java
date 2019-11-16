package algorithm;

import java.io.Serializable;

/**
 * This is a class that contains sorting methods
 *
 * @author Btanc
 */
public class Sort implements Serializable {

    private static final long serialVersionUID = -5980521921395336744L;

    /**
     * @param array This is the array of integer to be sorted
     * @author Btanc
     */
    public static void sort(int[] array) {

        // TODO
    }

    /**
     * @param array This is the array of long integer to be sorted
     * @author Btanc
     */
    public static void sort(long[] array) {
        // TODO
    }

    /**
     * @param array This is the array of single-precision floating-point to be sorted
     * @author Btanc
     */
    public static void sort(float[] array) {
        // TODO
    }

    /**
     * @param array This is the array of double-precision floating-point to be sorted
     * @author Btanc
     */
    public static void sort(double[] array) {
        // TODO
    }

    /**
     * @param array This is the array of character to be sorted
     * @author Btanc
     */
    public static void sort(char[] array) {

        // TODO
    }

    /**
     * @param array This is the array of integer to be sorted
     * @author Btanc
     */
    public static void quickSort(int[] array) {
        doQuickSort(array, 0, array.length - 1, 1);
    }

    /**
     * @param array     This is the array of integer to be sorted
     * @param left      The left boundary of sorted array
     * @param right     The right boundary of sorted array
     * @param direction The direction of sorted array
     * @author Btanc
     */
    private static void doQuickSort(int[] array, int left, int right, int direction) {
        int start = left, end = right;
        int box = array[start];
        while (start < end) {
            while (start < end && array[end] >= box) {
                --end;
            }
            array[start] = array[end];
            while (start < end && array[start] <= box) {
                ++start;
            }
            array[end] = array[start];
        }
        array[start] = box;
        if (start > left) {
            doQuickSort(array, left, start - 1, direction);
        }
        if (end < right) {
            doQuickSort(array, end + 1, right, direction);
        }
    }

    public static void main(String[] args) {
        int a = 1, n = 64;
        for (int i = 0; i < n; i++) {
            a = a << i;
            System.out.println(a);
        }
    }
}
