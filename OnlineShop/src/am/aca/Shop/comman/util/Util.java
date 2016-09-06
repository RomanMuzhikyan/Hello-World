package am.aca.Shop.comman.util;

public class Util {
    private static Integer productNextID = 1;
    private static Integer userNextID = 1;
    private static Integer orderNextID = 1;

    public static Integer generateProductID(){
        return ++productNextID;
    }
    public static Integer generateUserID(){
        return ++userNextID;
    }
    public static Integer generateOrderID(){
        return ++orderNextID;
    }
}
