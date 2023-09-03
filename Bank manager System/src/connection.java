//import static sun.reflect.misc.ReflectUtil.forName;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;

import static sun.util.calendar.CalendarSystem.forName;

//
//     5 STEP TO CONNECT JDBC

//     REGISTER THE DRIVER
//     CREATE CONNECTION
//     CREATE STATEMENT
//     EXECUTE QUERY
//     CLOSE CONNECTION
public class connection {
//     1. create connection

      Connection  c;
      Statement  s;
    public connection()
    {
        try {
          c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","Himanshu.123");
          s = c.createStatement();

        }catch (Exception e)
        {
            System.out.println(e);
        }
    }


}
