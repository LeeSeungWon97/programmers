public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01("abcdef","f");
        sol.solution01("BCBdbe","B");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(70);
        sol.solution02(91);
        sol.solution02(180);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03(10,3);
        sol.solution03(64,6);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(10);
        sol.solution04(4);
    }
}