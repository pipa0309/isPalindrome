package solutionsTasksTwo;

public class Test2 {

    public static void main(String[] args) {
        int x = 1490220941;
        long mod = 10L;
        int dev = 1;
        long xNum;
        int numAmount = (int)Math.log10(x) + 1;
        int count = 0;
        while (numAmount != count) {
            xNum = (x % mod) / dev;
            mod = mod * 10;
            dev = dev * 10;
            count++;
            System.out.print(xNum + " ");
        };
    }
}
