
public class Objects {

    public static Object createObjectFrom(Object x) {
		Object o = x;
        return o;
    }
    public static boolean equalsObjects(Object x, Object y) {
        Boolean b =  x == y && x.equals(y);
        return b;
    }
    public static Object Factory(){
          return new Object();
    }
}