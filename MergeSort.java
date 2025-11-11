public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6,12,567,527,34,4756,77};

        System.out.print("Before Sorting: ");
        for (int i : arr) {
           System.out.print(i + " "); 
        }
        System.out.println();

        mergeSort(arr, 0, arr.length - 1);

        System.out.print("After Sorting: ");
        for (int i : arr) {
           System.out.print(i + " "); 
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr, int startIdx, int endIdx) {
        if (startIdx >= endIdx) return ;

        int mid = startIdx + ((endIdx - startIdx) / 2);

        mergeSort(arr, startIdx, mid);
        mergeSort(arr, mid+1, endIdx);

        sortedArray(arr, startIdx, mid, endIdx);
    }

    private static void sortedArray(int[] arr, int s, int mid, int e) {
        int[] merged = new int[e - s + 1];
        int idx1 = s;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= e) {
            if (arr[idx1] >= arr[idx2]) {
                merged[x++] = arr[idx2++];
            } else {
                merged[x++] = arr[idx1++];
            }
        }

        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        while (idx2 <= e) {
            merged[x++] = arr[idx2++];
        }

        for (int i = 0, j = s; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
}
