public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(23);
        sol.solution01(24);
        sol.solution01(999);

        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(".... . .-.. .-.. ---");
        sol.solution02(".--. -.-- - .... --- -.");

        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03("2");
        sol.solution03("205");

        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(3,2);
        sol.solution04(5,3);
    }
}