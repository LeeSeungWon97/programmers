public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[] array1 = {3, 10, 28};
        int[] array2 = {10, 11, 12};
        sol.solution01(array1,20);
        sol.solution01(array2,13);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(3);
        sol.solution02(29423);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03("dfjardstddetckdaccccdegk",4);
        sol.solution03("pfqallllabwaoclk",2);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04("cccCCC");
        sol.solution04("abCdEfghIJ");
    }
}