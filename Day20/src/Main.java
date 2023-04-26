public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[][] dots1 = {{1,1},{2,1},{2,2},{1,2}};
        int[][] dots2 = {{-1,-1},{1,1},{1,-1},{-1,1}};
        sol.solution01(dots1);
        sol.solution01(dots2);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        String[] keyinput1 = {"left", "right", "up", "right", "right"};
        String[] keyinput2 = {"down", "down", "down", "down", "down"};
        int[] board1 = {11, 11};
        int[] board2 = {7,9};
        sol.solution02(keyinput1,board1);
        sol.solution02(keyinput2,board2);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] number1 = {1, 2, -3, 4, -5};
        int[] number2 = {0, -31, 24, 10, 1, 9};
        int[] number3 = {10, 20, 30, 5, 5, 20, 5};
        sol.solution03(number1);
        sol.solution03(number2);
        sol.solution03(number3);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04("3x + 7 + x");
        sol.solution04("x + x + x");
    }
}