public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[] box1 = {1,1,1};
        int[] box2 = {10,8,6};
        int n1 = 1;
        int n2 = 3;
        sol.solution01(box1,n1);
        sol.solution01(box2,n2);

        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(10);
        sol.solution02(15);

        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {0, 31, 24, 10, 1, 9};
        sol.solution03(numbers1);
        sol.solution03(numbers2);

        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(3628800);
        sol.solution04(7);
    }
}