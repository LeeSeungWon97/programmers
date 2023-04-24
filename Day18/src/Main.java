public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        sol.solution01("ab6CDE443fgh22iJKlmn1o","6CD");
        sol.solution01("ppprrrogrammers", "pppp");
        sol.solution01("AbcAbcA", "AAA");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02(144);
        sol.solution02(976);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03(2,10);
        sol.solution03(7,15);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04("Bcad");
        sol.solution04("heLLo");
        sol.solution04("Python");
    }
}