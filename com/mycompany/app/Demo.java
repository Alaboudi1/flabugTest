
public class Demo {

    public static int getBigger(int x, int y) {
        int big;
        if (y > x) // bug!
            big = x;
        else
            big = y;
        return big;
    }

    public static double getRandom() { // flaky test
        return Math.rint(10);
    }
}