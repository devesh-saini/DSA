public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {564,324,546,234,354};

        System.out.println("Before Sorting:");
        for (int i : arr) {
           System.out.print(i + " "); 
        }
        System.out.println();

        arr = selSort(arr);

        System.out.println("After Sorting:");
        for (int i : arr) {
           System.out.print(i + " "); 
        }
        System.out.println();
    }

    private static int[] selSort(int[] arr) {
        int startIdx = 0;
        int endIdx = arr.length;
    
        while(startIdx < endIdx) {
            int smallest = startIdx;
            for (int i = startIdx; i < endIdx; i++) {
                if (arr[i] < arr[smallest]) {
                    smallest = i;
                }
            }

            int temp = arr[startIdx];
            arr[startIdx++] = arr[smallest];
            arr[smallest] = temp;
        }

        return arr;
    }
}
