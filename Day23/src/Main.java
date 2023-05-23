public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[] numlist1 = {1,2,3,4,5,6};
        int[] numlist2 = {10000,20,36,47,40,6,10,7000};
        sol.solution01(numlist1,4);
        sol.solution01(numlist2,30);
        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[][] score1 = {{80,70},{90,50},{40,70},{50,80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};
        sol.solution02(score1);
        sol.solution02(score2);
        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        String[] babbling1 = {"aya", "yee", "u", "maa", "wyeoo"};
        String[] babbling2 = {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"};
        sol.solution03(babbling1);
        sol.solution03(babbling2);
        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        String[] id_pw1 = {"meosseugi", "1234"};
        String[] id_pw2 = {"programmer01", "15789"};
        String[] id_pw3 = {"rabbit04", "98761"};
        String[][] db1 = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
        String[][] db2 = {{"programmer02", "111111"},{"programmer00", "134"},{"programmer01", "1145"}};
        String[][] db3 = {{"jaja11", "98761"},{"krong0313", "29440"},{"rabbit00", "111333"}};
        sol.solution04(id_pw1,db1);
        sol.solution04(id_pw2,db2);
        sol.solution04(id_pw3,db3);
    }
}