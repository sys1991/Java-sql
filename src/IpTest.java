import com.mysql.jdbc.Driver;

import java.io.*;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * Created by Administrator on 2016/4/23.
 */
public class IpTest {
    public static final String URL= "jdbc:mysql:///ip?user=root&password=sys";
    private static final String INPUT_FILE_NAME = "d:/sys/ip.txt";
    public static void main(String[] args) throws SQLException, IOException {
        new Driver();
        java.sql.Connection connection =DriverManager.getConnection(URL);
       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(INPUT_FILE_NAME))){

           String line;
           while ((line = bufferedReader.readLine()) != null) {
               System.out.println(line);
               String sql = "INSERT INTO ip VALUES (NULL ,line)";
               java.sql.PreparedStatement preparedStatement =connection.prepareStatement(sql);

           }

       }


    }
}
