public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(3,2);
        sol.solution01(10,5);

        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[] arr1 = {1, 2, 7, 10, 11};
        int[] arr2 = {9, -1, 0};
        sol.solution02(arr1);
        sol.solution02(arr2);

        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] arr3 = {1, 2, 3, 3, 3, 4};
        int[] arr4 = {1, 1, 2, 2};
        int[] arr5 = {1};
        sol.solution03(arr3);
        sol.solution03(arr4);
        sol.solution03(arr5);

        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(10);
        sol.solution04(15);


    }
}