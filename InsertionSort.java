public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {765,32,45,65,47};

        System.out.print("Before sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        arr = insSort(arr);

        System.out.print("After sorting: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] insSort(int[] arr) {
        int sorted = 0;
        int endIdx = arr.length-1;

        while (sorted <= endIdx) {
            int unsorted = arr[sorted + 1];
            
            for (int s = 0; s < sorted - 1; s++) {
                if (unsorted < arr[s]) {
                    int temp = arr[s];
                    arr[s] = arr[s+1];
                    arr[s+1] = temp;
                }

                arr[s] = unsorted;
            }

            sorted++;
        }

        return arr;
    }
}
