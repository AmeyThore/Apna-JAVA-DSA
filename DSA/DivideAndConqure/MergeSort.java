package DSA.DivideAndConquer;

public class MergeSort {

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        int mid = si + (ei - si) / 2; // divide

        mergeSort(arr, si, mid); // conquer (left half)
        mergeSort(arr, mid + 1, ei); // conquer (right half)

        merge(arr, si, mid, ei); // conquer (merge the halves)
    }

    public static void merge(int arr[], int si, int mid, int ei) {
        int temp[] = new int[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of left array */
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        /* Copy remaining elements of right array */
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy temp to original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        int arr[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        mergeSort(arr, 0, arr.length - 1);
        printArr(arr);
    }
}
