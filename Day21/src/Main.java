public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01("aAb1B2cC34oOp");
        sol.solution01("1a2b3c4d123Z");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[][] board1 = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}};
        int[][] board2 = {{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 0, 0, 0},{0, 0, 1, 1, 0},{0, 0, 0, 0, 0}};
        int[][] board3 = {{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1},{1,1,1,1,1}};
        sol.solution02(board1);
        sol.solution02(board2);
        sol.solution02(board3);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] sides1 = {1, 2};
        int[] sides2 = {3,6};
        int[] sides3 = {11,7};
        sol.solution03(sides1);
        sol.solution03(sides2);
        sol.solution03(sides3);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        String[] spell1 = {"p", "o", "s"};
        String[] dic1 = {"sod", "eocd", "qixm", "adio", "soo"};
        String[] spell2 = {"z", "d", "x"};
        String[] dic2 = {"def", "dww", "dzx", "loveaw"};
        String[] spell3 = {"s", "o", "m", "d"};
        String[] dic3 = {"moos", "dzx", "smm", "sunmmo", "som"};
        sol.solution04(spell1,dic1);
        sol.solution04(spell2, dic2);
        sol.solution04(spell3,dic3);
    }
}