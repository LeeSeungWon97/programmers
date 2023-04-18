public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        // Problem 1
        System.out.println("Problem 1");
        sol.solution01("onetwothreefourfivesixseveneightnine");
        sol.solution01("onefourzerosixseven");
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        sol.solution02("hello",1,2);
        sol.solution02("I love you",3,6);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        sol.solution03("abcabcadc");
        sol.solution03("abdc");
        sol.solution03("hello");
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        sol.solution04(24);
        sol.solution04(29);
    }
}