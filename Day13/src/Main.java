public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        System.out.println("Problem 1");
        sol.solution01("1 2 Z 3");
        sol.solution01("10 20 30 40");
        sol.solution01("10 Z 20 Z 1");
        sol.solution01("10 Z 20 Z");
        sol.solution01("-1 -2 -3 Z");

        System.out.println();

        System.out.println("Problem 2");
        String[] strlist1 = {"We", "are", "the", "world!"};
        String[] strlist2 = {"I", "Love", "Programmers."};
        sol.solution02(strlist1);
        sol.solution02(strlist2);

        System.out.println();

        System.out.println("Problem 3");
        sol.solution03("people");
        sol.solution03("We are the world");

        System.out.println();

        System.out.println("Problem 4");
        int[] sides1 = {1,2,3};
        int[] sides2 = {3, 6, 2};
        int[] sides3 = {199, 72, 222};
        sol.solution04(sides1);
        sol.solution04(sides2);
        sol.solution04(sides3);
    }
}