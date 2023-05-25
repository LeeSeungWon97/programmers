public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01("hello","ohell");
        sol.solution01("apple","elppa");
        sol.solution01("atat","tata");
        sol.solution01("abc","abc");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(2,2);
        sol.solution02(2,5);
        sol.solution02(1,1);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03(3,12);
        sol.solution03(5,15);
        sol.solution03(4,14);
        sol.solution03(5,5);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        int[] common1 = {1,2,3,4};
        int[] common2 = {2,4,8};
        sol.solution04(common1);
        sol.solution04(common2);
    }
}