public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(29183,1);
        sol.solution01(232443,4);
        sol.solution01(123456,7);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[] numlist1 = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] numlist2 = {1, 9, 3, 10, 13, 5};
        int[] numlist3 = {2, 100, 120, 600, 12, 12};
        sol.solution02(3,numlist1);
        sol.solution02(5,numlist2);
        sol.solution02(12,numlist3);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03(1234);
        sol.solution03(930211);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        String[] quiz1 = {"3 - 4 = -3", "5 + 6 = 11"};
        String[] quiz2 = {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"};
        sol.solution04(quiz1);
        sol.solution04(quiz2);
    }
}