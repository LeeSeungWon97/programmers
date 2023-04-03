import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        sol.solution01("jaron");
        sol.solution01("bread");

        System.out.println();

        // Problem 2
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        sol.solution02(n);

        System.out.println();

        // Problem 3
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5, 7};
        sol.solution03(arr1);
        sol.solution03(arr2);

        System.out.println();

        // Problem 4
        sol.solution04("hello",3);
    }
}