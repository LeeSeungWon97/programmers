public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Problem 1
        System.out.println("Problem 1");
        sol.solution01(100);
        sol.solution01(1081);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02("10","11");
        sol.solution02("1001","1111");
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03("olleh","hello");
        sol.solution03("allpe","apple");

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(1,13,1);
        sol.solution04(10,50,5);
        sol.solution04(3,10,2);
    }
}