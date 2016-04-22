import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;


import java.sql.SQLException;

/**
 * Created by Administrator on 2016/4/22.
 */
public class JavaSQL {
    public static final String URL = "jdbc:mysql:///scott?user=root&password=sys";
    public static void main(String[] args) throws SQLException {
        new Driver();

    }
}
