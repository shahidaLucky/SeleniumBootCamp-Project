package util;

/**
 * Created by mrahman on 1/9/16.
 */
public class TestConnectDB {

    public static void main(String[] args) throws Exception{
        ConnectDB db = new ConnectDB();
        System.out.println(db.readDataBase());
    }
}
