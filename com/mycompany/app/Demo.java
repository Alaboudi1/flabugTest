
public class Demo {

    public static int getBigger(int x, int y) {
        int big;
        if (x > y)
            big = x;
        else
            big = y;
        return big;
    }

    public static double getRandom() {
        return Math.rint(10);
    }
}