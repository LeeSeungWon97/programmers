public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 3, 5};
        sol.solution01(arr1,1,3);
        sol.solution01(arr2,1,2);

        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(23);
        sol.solution02(51);
        sol.solution02(100);

        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] arr3 = {3, 76, 24};
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr5 = {30, 10, 23, 6, 100};
        sol.solution03(arr3);
        sol.solution03(arr4);
        sol.solution03(arr5);

        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(20);
        sol.solution04(100);

    }
}