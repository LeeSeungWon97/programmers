public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Problem 1
        System.out.println("Problem 1");
        int[] dot1 = {2,4};
        int[] dot2 = {-7,9};
        sol.solution01(dot1);
        sol.solution01(dot2);

        System.out.println();

        // Problem 2
        System.out.println("Problem 2");
        int[] num_list1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int n1 = 2;
        int[] num_list2 = {100, 95, 2, 4, 5, 6, 18, 33, 948};
        int n2 = 3;
        sol.solution02(num_list1,n1);
        sol.solution02(num_list2,n2);

        System.out.println();

        // Problem 3
        System.out.println("Problem 3");
        int[] numbers1 = {1, 2, 3, 4};
        int k1 = 2;
        int[] numbers2 = {1, 2, 3, 4, 5, 6};
        int k2 = 5;
        int[] numbers3 = {1, 2, 3};
        int k3 = 3;
        sol.solution03(numbers1,k1);
        sol.solution03(numbers2,k2);
        sol.solution03(numbers3,k3);

        System.out.println();

        // Problem 4
        System.out.println("Problem 4");
        int[] number1 = {1, 2, 3};
        String direction1 = "right";
        int[] number2 = {4, 455, 6, 4, -1, 45, 6};
        String direction2 = "left";
        sol.solution04(number1,direction1);
        sol.solution04(number2,direction2);
    }
}