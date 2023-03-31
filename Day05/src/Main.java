public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(150000);
        sol.solution01(580000);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(5500);
        sol.solution02(15000);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03(40);
        sol.solution03(23);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 1, 1, 1, 1, 2};
        int[] arr3 = {1, 0, 1, 1, 1, 3, 5};
        sol.solution04(arr1);
        sol.solution04(arr2);
        sol.solution04(arr3);

    }
}