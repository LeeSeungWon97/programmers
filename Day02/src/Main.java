public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 01
        System.out.println("Problem 1");
        sol.solution01(3,2);
        sol.solution01(7,3);
        sol.solution01(1,16);

        System.out.println();

        // Problem 02
        System.out.println("Problem 2");
        sol.solution02(2,3);
        sol.solution02(11,11);
        sol.solution02(7,99);

        System.out.println();

        // Problem 03
        System.out.println("Problem 3");
        sol.solution03(1,2,3,4);
        sol.solution03(9,2,1,3);

        System.out.println();


        // Problem 04
        System.out.println("Problem 4");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 100, -99, 1, 2, 3};
        sol.solution04(arr1);
        sol.solution04(arr2);
    }
}