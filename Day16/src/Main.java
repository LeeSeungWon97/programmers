public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01("happy birthday!");
        sol.solution01("I love you~");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[] array1 = {1,8,3};
        int[] array2 = {9,10,11,8};
        sol.solution02(array1);
        sol.solution02(array2);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03("3 + 4");
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"com", "b", "d", "p", "c"};
        String[] s3 = {"n", "omg"};
        String[] s4 = {"m", "dot"};
        sol.solution04(s1,s2);
        sol.solution04(s3,s4);
    }
}