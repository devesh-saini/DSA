import java.util.Scanner;

class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = new int[7];
        int idx = 0;

        for (idx = 0; idx < array.length; idx++) {
            System.out.print("Value: ");
            array[idx] = sc.nextInt();
        }
        
        System.out.println("Before Bubble Sort:");
        for (idx = 0; idx < array.length;idx++) {
            System.out.print(array[idx] + " ");
        }

        // Bubble Sort
        for (int i = 0; i < array.length - 2; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("After Bubble Sort:");
        for (idx = 0; idx < array.length;idx++) {
            System.out.print(array[idx] + " ");
        }

        System.out.println();
    }
}
