public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(15);
        sol.solution01(40);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[][] dots1 = {{1, 4}, {9, 2}, {3, 8}, {11, 6}};
        int[][] dots2 = {{3, 5}, {4, 1}, {2, 4}, {5, 10}};
        sol.solution02(dots1);
        sol.solution02(dots2);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[][] lines1 = {{0,1},{2,5},{3,9}};
        int[][] lines2 = {{-1,1},{1,3},{3,9}};
        int[][] lines3 = {{0,5},{3,9},{1,10}};
        sol.solution03(lines1);
        sol.solution03(lines2);
        sol.solution03(lines3);

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(7,20);
        sol.solution04(11,22);
        sol.solution04(12,21);
    }
}