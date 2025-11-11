import java.util.Scanner;
import java.util.ArrayList;

class Recursion {
    public static void main(String[] args) {
        ArrayList<Integer> subset = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Possible subsets: ");
        findSubsets(n, subset);
    }

    static void findSubsets(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            printSubset(subset);
            return;
        }

        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size()-1);
        findSubsets(n-1, subset);
    }

    static void printSubset(ArrayList<Integer> subset) {
        System.out.print("{ ");
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.print("}    \n");
    }
}
