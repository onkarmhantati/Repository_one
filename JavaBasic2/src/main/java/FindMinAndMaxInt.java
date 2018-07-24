/**
 * Created by onkar.mhantati on 5/29/2018.
 */
public class FindMinAndMaxInt {
    public static void main(String args[]) {
        int a[] = {25, 875, 0, 1, -5};
        System.out.println("Min No: " + findMin(a));
        System.out.println("Max No: " + findMax(a));
    }

    static int findMin(int arr[]) {
        int min = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    static int findMax(int arr[]) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
