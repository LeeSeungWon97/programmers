public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[] array1 = {7, 77, 17};
        int[] array2 = {10, 29};
        sol.solution01(array1);
        sol.solution01(array2);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02("abc1Addfggg4556b",6);
        sol.solution02("abcdef123",3);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] array3 = {1, 1, 2, 3, 4, 5};
        int[] array4 = {0, 2, 3, 4};
        sol.solution03(array3,1);
        sol.solution03(array4,1);
        System.out.println();

        // Problem 4
        int[] array5 = {149, 180, 192, 170};
        int[] array6 = {180, 120, 140};
        sol.solution04(array5,169);
        sol.solution04(array6,190);
    }
}