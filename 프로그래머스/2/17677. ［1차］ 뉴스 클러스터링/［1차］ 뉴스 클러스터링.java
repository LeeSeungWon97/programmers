import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(String str1, String str2) {
        ArrayList<String> strList1 = getStrSetList(str1);
        ArrayList<String> strList2 = getStrSetList(str2);

        ArrayList<String> union = new ArrayList<>();
        ArrayList<String> intersection = new ArrayList<>();

        for (String s : strList1) {
            union.add(s);
            for (int i = 0; i < strList2.size(); i++) {
                if (strList2.get(i).equals(s)) {
                    intersection.add(s);
                    strList2.remove(i);
                    break;
                }
            }
        }

        for (String s : strList2) {
            union.add(s);
        }
        double jaccard = getJaccard(intersection.size(), union.size());

        return (int) (jaccard * 65536);
    }

    private ArrayList<String> getStrSetList(String str) {
        ArrayList list = new ArrayList();
        str = str.toLowerCase();
        for (int i = 0; i < str.length() - 1; i++) {
            String s = str.substring(i, i + 2);
            if (s.matches("^[a-z]+$")) {
                list.add(s);
            }
        }
        Collections.sort(list);
        return list;
    }

    private double getJaccard(int num1, int num2) {
        if (num1 == 0 && num2 == 0) {
            return 1.0;
        }
        return (double) num1 / num2;
    }
}