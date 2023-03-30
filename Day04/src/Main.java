public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(7);
        sol.solution01(1);
        sol.solution01(15);

        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(6);
        sol.solution02(10);
        sol.solution02(4);

        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03(7,10);
        sol.solution03(4,12);

        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
        sol.solution04(arr1);
        sol.solution04(arr2);
    }
}