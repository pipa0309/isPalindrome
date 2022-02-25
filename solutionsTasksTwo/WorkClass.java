package solutionsTasksTwo;

import java.util.ArrayList;

public class WorkClass {
    public static void main(String[] args) {
        boolean flag = isPalindrome(1410110141);
        System.out.println(flag);
    }

    private static ArrayList<Integer> getIntegers(int x) {
        long mod = 10L;
        int dev = 1;
        long xNum;
        int numAmount = (int) Math.log10(x) + 1;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (numAmount != count) {
            xNum = (x % mod) / dev;
            mod = mod * 10;
            dev = dev * 10;
            count++;
            list.add((int) xNum);
        }
        return list;
    }

    private static boolean checkPalindrome(ArrayList<Integer> list) {
        int count = 1;
        for (int i = 0; i < list.size(); i++) {
            if (!(list.get(list.size() - count).equals(list.get(i)))) {
                return false;
            } else {
                count++;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int x) {
        if (x == 0) return true;
        if (x % 10 == 0 || x < 0) return false;

        ArrayList<Integer> list = getIntegers(x);
        return checkPalindrome(list);
    }
}
